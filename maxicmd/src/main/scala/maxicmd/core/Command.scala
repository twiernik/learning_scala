package maxicmd.core {

	object Command {
		def create(name: String)(method: =>Unit) = new Command(name,method)
	}

	class Command(val name: String,method: =>Unit) {
		def run = method
	}
}
