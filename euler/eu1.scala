
println("Project euler task 1 ->  sum numbers from 1 to 999 that are dividable by 3 or 5")

// this creates range from 1 to 1000, there is no collection yet
val range = 1 until 1000; 

// range is equivalent to
val range2 = Range(1,1000)
// and also
val range3 = 1 to 999

assert(range == range2)
assert(range2 == range3)

def condition(i: Int) = i % 5 == 0 || i % 3 == 0

println("Sum = " + range.view.filter(condition).sum)

// if we remove the view code also works but in different way

 // this is Vector(3,5,6 and so this accessing a range this was creates every item in collection
println(range.filter(condition).toString.substring(0,30) + " ...")
// this is SeqViewF(...) this however works initializes item only when tey are used
println(range.view.filter(condition)) 