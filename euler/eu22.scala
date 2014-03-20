val lines = scala.io.Source.fromFile("eu22_names.txt").mkString

val chardiff = 'a'.toInt - 1

def getNameScore(str: String) : Int = str.map(c => c.toLower.toInt - chardiff).sum

var names = lines.split(",").map(name => name.stripPrefix("\"").stripSuffix("\"")).sorted.zip(Stream.from(1)).map(k => getNameScore(k._1) * k._2).sum

println(names)