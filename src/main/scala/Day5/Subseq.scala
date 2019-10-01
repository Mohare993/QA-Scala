package Day5

import scala.math.max

object Subseq extends App {

  def getAllSubstrings(str: String): Set[String] = {
    str.inits.flatMap(_.tails).toSet
  }

  def longestCommonSubstring(str1: String, str2: String): String = {
    val str1Substrings = getAllSubstrings(str1)
    val str2Substrings = getAllSubstrings(str2)
    println(str1Substrings)
    println(str2Substrings)

    str1Substrings.intersect(str2Substrings).maxBy(_.length)
  }

  println(longestCommonSubstring("ABSFSDFG", "ABCF"))
}

