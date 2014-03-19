def isPalindrom(str :String) : Boolean = str == str.reverse

def getPairs() : Stream[(Int,Int)] = {
	def getPairs(tuple: (Int,Int)) : Stream[(Int,Int)] = {
		tuple match {
			case k if k._1 == 999 => Stream.empty
			case k =>  Range(k._1+1,1000).map(k2 => (k._1,k2)).toStream #::: getPairs((k._1+1,1))
		}
	}
	getPairs((100,1))
}

println(getPairs.map(t => t._1 * t._2).filter(product => isPalindrom(product.toString)).max)