package Day2

object Basic2 extends App {

  // Pattern Matching 1
  def patternMatch(num1: Int, num2: Int, bool: Boolean): Unit = bool match {
    case true => println(num1 + num2)
    case false => println(num1*num2)
  }

  patternMatch(2,4,true)
  patternMatch(2,4,false)

  // Pattern Matching 1.2
  case class Nums(num1: Int, num2: Int)

  def patternMatch2(nums: Any): Unit = nums match {
    case Nums(0,0) => println(0)
    case Nums(num1,0) => println(num1)
    case Nums(0,num2) => println(num2)
    case Nums(num1,num2) => println(num1 + num2)
  }

  patternMatch2(Nums(0,2))
  patternMatch2(Nums(4,0))
  patternMatch2(Nums(5,6))
  patternMatch2(Nums(0,0))


  // Pattern Match 2
//  def patternMatch3(nums: Any): Unit = nums match {
//    case Nums(num1, num2) => println(num2,num1)
//  }
//
//  patternMatch2((1,2))

}
