import maxicmd.core.Command

package maxicmd {

import maxicmd.core.CommandLoop
import com.typesafe.config.{ConfigFactory, Config}
import net.ceedubs.ficus.FicusConfig._

object Program extends App {

  val config = ConfigFactory.load()
  val maxiService = new MaxiXmlService(config.as[MaxiCredentials]("maxithlon.user"))
  var maxiReporter = new MaxiPrint
  maxiService.login()

  def getHelloCmd = new Command("hello", args => {
    println("hello")
  })

  def doImport = new Command("import", args => {
    maxiService.runImports()
  })

  def printWord = new Command("print", args => {
    println(args.head)
  })

  val commandLoop = new CommandLoop(getHelloCmd :: doImport :: printWord :: Nil)
  commandLoop.runLoop
}

}