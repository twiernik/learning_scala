import maxicmd.core.Command

package maxicmd {

import maxicmd.core.CommandLoop

object Program extends App {

  def getHelloCmd = new Command("hello", {
    println("hello")
  })

  val commandLoop = new CommandLoop(getHelloCmd :: Nil)
  commandLoop.runLoop

}

}