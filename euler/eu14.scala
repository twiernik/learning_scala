def getCollatz(i: Int) : Stream[Int] = { 
	i match {
		case 1 => 1 #:: Stream.empty
		case even if even % 2 == 0 => even  #:: getCollatz( even / 2 )
		case _ => i #:: getCollatz(3 * i + 1)
	}
}

//println(getCollatz(999987).length)
println((1 until 1000000).map(n => (n,getCollatz(n).length)).length)