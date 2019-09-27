package Day4

object MorseTranslator extends App {

  val morseMap = Map(".-" -> "A", "-..." -> "B", "-.-." -> "C", "-.." -> "D", "." -> "E", "..-." -> "F", "--." -> "G",
    "...." -> "H", ".." -> "I", ".---" -> "J", "-.-" -> "K", ".-.." -> "L", "--" -> "M", "-." -> "N", "---" -> "O",
    ".--." -> "P", "--.-" -> "Q", ".-." -> "R", "..." -> "S", "-" -> "T", "..-" -> "U", "...-" -> "V", ".--" -> "W",
    "-..-" -> "X", "-.--" -> "Y", "--.." -> "Z", ".----" -> "1", "..---" -> "2", "...--" -> "3", "....-" -> "4", "....."
      -> "5", "-...." -> "6", "--..." -> "7", "---.." -> "8", "----." -> "9", "-----" -> "0", "/" -> " ")

  def morseTranslator(morse: String): Unit = {
    var decode = ""
    val codeArray = morse.split(" ")
          for (i <- codeArray) {
        decode += morseMap.getOrElse(i, "")
      }
    println(decode)
  }

  morseTranslator(".... . .-.. .-.. --- / .--. .-. --- --. .-. .- -- -- . .-. ")


//  def morseEncoder(text: String): Unit = {
//    var encode = ""
//    val codeArray = text.sliding(1).toArray
//    for ( i <- codeArray) {
//      encode += morseMap.getOrElse(i, "")
//      for { (k,v) <- codeArray if v.contains(value) } yield k
//    }
//    println(encode)
//  }



}
