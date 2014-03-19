package maxicmd.core {

object Command {
  def create(name: String)(method: Array[String] => Unit) = new Command(name, method)

  def create(name: String)(method: => Unit) = new Command(name, _ => method)
}

class Command(val name: String, method: Array[String] => Unit) {
  def run = method
}

}
