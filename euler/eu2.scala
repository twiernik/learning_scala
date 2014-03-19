val fibonacciStream: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibonacciStream.zip(fibonacciStream.tail).map { n => n._1 + n._2 }

println(fibonacciStream.takeWhile(x => x < 4000000).filter(_ % 2 == 0).sum)
