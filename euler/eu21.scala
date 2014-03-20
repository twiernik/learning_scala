def getDivisors(i: Int) : List[Int] = {
	(2 to Math.floor(Math.sqrt(i)).toInt)
		.filter(d => i%d == 0)
		.flatMap(d => List(d,i/d))
		.toList
}


def d(n: Int) = getDivisors(n).sum + 1

def isAmbicable(n: Int) :Boolean = {
	val x = d(n)
	val y = d(x)
	if(n == y && x != n)
		return true
	return false
}

println((1 until 10000).filter(isAmbicable).sum)
