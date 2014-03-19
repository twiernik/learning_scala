package maxicmd
import org.specs2.mutable._

/**
 * Created by Kobek on 19.03.14.
 */
class MaxiXmlReaderSpecs extends Specification {

  "MaxiXmlReader" should {
    "have default constructor" in {
      new MaxiXmlReader must not beNull
    }
  }
}
