package Day3

import java.util.TimeZone

object Intermediate extends App {

  // Functional 1
  val timeZones: Unit = java.util.TimeZone.getAvailableIDs().map(_.split("/"))
    .filter(zone => zone.length != 1).map(_.last)
    .grouped(10)
    .foreach(zone => print(zone(1) + ", "))

  // Blackjack
  case class

  def blackjack(num1: Int, num2: Int) =




}

