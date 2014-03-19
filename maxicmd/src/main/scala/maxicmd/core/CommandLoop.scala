package maxicmd.core

class CommandLoop(commands: List[Command]) {

  def runLoop : Unit = {
      printHoney
      val cmd = Console.readLine()
      cmd match {
        case null => runLoop
        case cmd if commandExists(cmd) => runCommand(cmd)
        case "exit" => { println("bye") }
        case _  => {
          println("No such command")
          runLoop
        }
      }
  }

  def commandExists(name: String) : Boolean = commands.find(c => c.name == name).isDefined

  def runCommand(name: String) : Unit = {
    commands.find(c => c.name == name).get.run
    runLoop
  }

  def printHoney = {
    print("> ")
    Console.flush
  }
}
