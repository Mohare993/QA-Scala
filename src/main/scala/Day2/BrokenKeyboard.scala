package Day2

object BrokenKeyboard extends App {

  def brokenKeyboard() {
    import scala.collection.mutable.ListBuffer
    import scala.io.Source
    val filename = "C:\\Users\\Administrator\\IdeaProjects\\QA-Scala\\src\\main\\scala\\Day2\\enable1.txt"
    val textFile = Source.fromFile(filename).getLines.toList
    var linesIn = new ListBuffer[String]()
    println("Enter number of lines to read : ")
    var numberOfLines = scala.io.StdIn.readInt


    while (numberOfLines > 0) {
      println("Enter chars : ")
      linesIn += scala.io.StdIn.readLine()
      numberOfLines -= 1
    }

    for (str <- linesIn) {
      var words = new ListBuffer[String]()
      for (i <- textFile if i.forall(str.toList.contains)) yield {
        words += i
        println(str + " = " + i)
      }
      println("Max Word " + str + " = " + (words.maxBy(_.length)))
    }
    }

  brokenKeyboard()
}
