val twos : Stream[BigInt] = BigInt(2) #:: twos

println(twos.take(1000).foldLeft(BigInt(1)){_*_}.toString.map(_.toInt - '0'.toInt).sum)