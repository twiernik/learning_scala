import maxicmd.core.Command

package maxicmd {



	object Program extends App { 

		var commands = maxicmd.core.Command.create("hello") { println("hello comd")} :: Nil

		def printHoney = {
			print("> ")
			Console.flush
		}

		def commandExists(name: String) : Boolean = commands.find(c => c.name == name).isDefined

		def runCommand(name: String) : Unit = {
			commands.find(c => c.name == name).get.run
			readCommand
		}

		def readCommand() : Unit = {
			printHoney
			var cmd = Console.readLine()
			cmd.trim match {
				case cmd if commandExists(cmd) => runCommand(cmd)
				case "exit" => { println("bye") }
				case _  => {
					println("No such command")
					readCommand
				}
			}		
		}

		readCommand
	}
}