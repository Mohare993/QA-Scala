package Day5

object PrimeNumbers extends App {

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 1000000 to 3000000 if isPrime(i)) println(i)

  isPrime(3000000)
}


