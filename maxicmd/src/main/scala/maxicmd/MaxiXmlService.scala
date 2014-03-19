package maxicmd

import maxicmd.jooq._
import org.apache.http.impl.client.HttpClients
import org.apache.http.client.methods.HttpGet
import scala.xml.{Elem, XML, Node}
import org.apache.http.util.EntityUtils
import org.joda.time.Days
import org.joda.time.DateTime
import org.joda.time.LocalDate
import maxicmd.jooq.Tables
import maxicmd.jooq.tables.records.AthleteRecord

class MaxiXmlService(credentials: MaxiCredentials) {
  val httpClient = HttpClients.createDefault()
  val context = ConnHelper.getContext()

  implicit def reflector(ref: AnyRef) = new {
    def getV(name: String): Any = ref.getClass.getMethods.find(_.getName == name).get.invoke(ref)

    def setV(name: String, value: Any): Unit = ref.getClass.getMethods.find(_.getName.toLowerCase.contains("set" + name.toLowerCase)).get.invoke(ref, value.asInstanceOf[AnyRef])

    def hasProperty(name: String): Boolean = ref.getClass.getMethods.find(_.getName == name) != null
  }

  def login() {
    val get = new HttpGet("http://www.maxithlon.com/maxi-xml/login.php?user=" + credentials.name + "&scode=" + credentials.pass)
    httpClient.execute(get)
  }

  def getAthletesData: Node = {
    val stringResponse = EntityUtils.toString(httpClient.execute(new HttpGet("http://www.maxithlon.com/maxi-xml/athletes.php")).getEntity, "utf-8")
    XML.loadString(stringResponse)
  }

  def shouldImport: Boolean = {
    Days.daysBetween(
      new DateTime(context.select(Tables.ATHLETE.DATE.max()).from(Tables.ATHLETE).fetch().get(0).value1().getTime).toLocalDate,
      LocalDate.now).getDays  > 0
  }

  def runImports() {
    if (shouldImport)
      performImports()
    else
      println("Dane były już dziś importowane")
  }

  def performImports() {
    importAthletes()
  }

  def getAthleteRecord(athleteNode: Node): AthleteRecord = {
    val athleteRecord = new AthleteRecord

    athleteNode.child.filter(_.isInstanceOf[Elem]).foreach(k => {
      try{
       k match {
        case n if n.text.isEmpty =>
        case n if n.text.forall(_.isDigit) => athleteRecord.setV(n.label, n.text.toInt)
        case n => athleteRecord.setV(n.label, n.text)
       }
      }catch{
        case e: Exception => {
          println(e)
        }
      }
    })
    athleteRecord
  }

  def saveRecord[R <: org.jooq.TableRecord[R]](tableRecord: R) {
    try
    {
    if (tableRecord.hasProperty("date"))
      tableRecord.setV("date", new java.sql.Time(java.util.Calendar.getInstance().getTimeInMillis))
    context.executeInsert(tableRecord)
    }catch{
      case e: Exception => {
        println(e)
      }


    }
  }

  def importAthletes() {
    (getAthletesData \ "athlete").map(getAthleteRecord).foreach(n => saveRecord(n))
  }

  def getElements(entityXml: Node): List[Node] = {
    entityXml.child.filter(_.isInstanceOf[Elem]).toList
  }

  def guessElementClasses(entityXml: Node): List[(String, Class[_])] = {
    getElements(entityXml).map(n => (n.label, guessClass(n.text)))
  }

  def guessClass(str: String): Class[_] = {
    if (str.forall(_.isDigit))
      classOf[Int]
    else
      classOf[String]
  }


}
