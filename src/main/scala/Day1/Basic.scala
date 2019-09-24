package Day1

object Basic extends App {

  println("Hello World!")
  var helloWorld = "Hello World!"
  println(helloWorld)
  def printWord(word: String) = println(word)
  printWord("test")
  def printHelloWorld() = "Hello World!"
  println(printHelloWorld())


  def stringPrinting(str: String, num: Int) =
    println(str())
}
