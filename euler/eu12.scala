def getDivisors(i: Int) : List[Int] = {
	(2 to Math.floor(Math.sqrt(i)).toInt)
		.filter(d => i%d == 0)
		.map(d => List(d,i/d))
		.flatten
		.toList
}

val triangleTuples : Stream[(Int,Int)] = (1,1) #:: triangleTuples.map(tuple => (tuple._1+1,tuple._1+1+tuple._2))
val triangleNumbers = triangleTuples.map(_._2)

println(triangleNumbers.dropWhile(i => (getDivisors(i).length + 2) < 500).head)