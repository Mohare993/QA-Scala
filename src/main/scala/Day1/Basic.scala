package Day1

object Basic extends App {

  println("Hello World!")

  var helloWorld = "Hello World!"
  println(helloWorld)

  def printWord(word: String) = println(word)
  printWord("test")

  def printHelloWorld() = "Hello World!"
  println(printHelloWorld())

  def returnAnyType(a: Any) = println(a)
  returnAnyType(2.003)
  returnAnyType(23)
  returnAnyType(true)
  returnAnyType("String")



  def stringPrinting(str: String, num: Int) =
    println(str.takeRight(num))

  stringPrinting("Hello",3)


}
