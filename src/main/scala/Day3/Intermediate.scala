package Day3

import java.util.TimeZone

class Intermediate {

  // Functional 1
  val timeZones: Unit = java.util.TimeZone.getAvailableIDs().map(_.split("/"))
    .filter(zone => zone.length != 1).map(_.last)
    .grouped(10)
    .foreach(zone => print(zone(1) + ", "))

  // Blackjack
  def blackjack(num1: Int, num2: Int) = {
      val num1Bust=num1>21
      val num2Bust=num2>21
      (num1, num2) match {
        case _ if num1Bust && num2Bust => 0
        case _ if num1Bust => num2
        case _ if num2Bust => num1
        case _ if num1>num2 => num1
        case _ => num2
      }
    }

    println(blackjack(18, 21))
    println(blackjack(20, 18))
    println(blackjack(22, 22))

  // Unique Sum
  def uniqueSum(num1: Int, num2: Int, num3: Int): Int = { (num1, num2, num3) match {
    case _ if num1 == num2 && num2 == num3 => 0
    case _ if num1 == num2 => num3
    case _ if num1 == num3 => num2
    case _ if num2 == num3 => num1
    case  _ => num1 + num2 + num3
    }
  }

  println(uniqueSum(1,2,3))
  println(uniqueSum(3,3,3))
  println(uniqueSum(1,1,2))

  // Too hot?
  def tooHot(temp: Int, isSummer: Boolean): Boolean = {
    (temp, isSummer) match {
      case (_, false) => temp >= 60 && temp <= 90
      case (_, true) => temp >= 60 && temp <= 100
    }
  }

  println(tooHot(80, false))
  println(tooHot(100, false))
  println(tooHot(100, true))
}
