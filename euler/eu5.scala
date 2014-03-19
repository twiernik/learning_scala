// def condition(i: Int) : Boolean = List(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

// some can be lefof
// if divisable by 6 it is divisable by 2 and 3
// if divisable by 10 it is divisable by 2 and 5
def condition(i: Int) : Boolean = List(2,3,4,5,7,8,9,11,13,16,17,19).forall(d => i % d == 0)

// limit take prime numbers from condition list and multiply
var step = List(2,3,5,7,11,13,17,19).reduceLeft{ _ * _ }

println(Stream.from(step,step).dropWhile(i => !condition(i)).head)