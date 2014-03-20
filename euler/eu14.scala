
def getCollatz(i: Long) : Stream[Long] = { 
	i match {
		case 1 => 1 #:: Stream.empty
		case even if even % 2 == 0 => even  #:: getCollatz( even / 2 )
		case _ => i #:: getCollatz(3 * i + 1)
	}
}

val cache = scala.collection.mutable.HashMap(1.toLong -> 1.toLong)
cache += (2.toLong -> 2.toLong)

def getCollatzNextItem(i: Long ) : Long = {
	i match {
		case even if even % 2 == 0 => even / 2 
		case _ => 3 * i + 1
	}
}

def getCollatzLen(i: Long) : Long = {
		if(cache.contains(i))
		{
			return cache(i)
		}
		var steps = 0
		var tmp = i
		while(!cache.contains(tmp))
		{
			steps = steps + 1
			tmp = getCollatzNextItem(tmp)
		}
		val value = steps + cache(tmp)
		cache += (i -> value)
		return value

}

//println(getCollatzLen(998888))
println((10000 until 1000000).map(i => (i,getCollatzLen(i))).maxBy(k => k._2))





