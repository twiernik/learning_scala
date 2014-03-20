var lst = List(BigInt(1),BigInt(1))

val level = 20

// grow
for(i <- 1 to level-1)
	lst = (BigInt(1) :: lst.sliding(2).map(l => l.foldLeft(BigInt(0)){(a,b) => a + b}).toList) :+ BigInt(1)	


// shrink
for(i <- 1 to level)
	lst = lst.sliding(2).map(_.foldLeft(BigInt(0)){_+_}).toList


println(lst.head)

