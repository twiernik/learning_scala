 // http://www.codecodex.com/wiki/Calculate_an_integer_square_root
def sqrt(number : BigInt) = {
  def next(n : BigInt, i : BigInt) : BigInt = (n + i/n) >> 1
 
  val one = BigInt(1)
 
  var n = one
  var n1 = next(n, number)
     
  while ((n1 - n).abs > one) {
    n = n1
    n1 = next(n, number)
  }
      
  while (n1 * n1 > number) {
    n1 -= one
  }
      
  n1
}

def getPrimeFactors(i: BigInt): List[BigInt] = {
	def getPrimeFactors(i: BigInt, divisor: BigInt, factors: List[BigInt]): List[BigInt] = i match {
	  case k: BigInt if k == 1 => factors
	  case k: BigInt if k % divisor == 0 => getPrimeFactors(i / divisor, divisor, divisor :: factors)
	  case k: BigInt if divisor > sqrt(k) => k :: factors
	  case _ => getPrimeFactors(i, divisor + 1, factors)
	}
	getPrimeFactors(i, 2, Nil)
}

println(getPrimeFactors(BigInt.apply("600851475143")).max)
