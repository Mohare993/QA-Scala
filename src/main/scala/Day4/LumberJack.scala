package Day4

object LumberJack extends App {

  def lumberjack(): Unit = {
    var count = 0
    println("Enter the size of the grid : ")
    val gridSize = scala.io.StdIn.readInt
    println("Enter the number of the logs : ")
    var numberOfLogs = scala.io.StdIn.readInt
    println("Enter the number of the logs in current log pile : ")
    var logPile = scala.io.StdIn.readLine().toString.toCharArray.map(_.toString.toInt).toList
    println("Current Log Pile :")
    getStorageGrid()
    println("\nNew Log Pile :")
    storageCalculator()


    def getStorageGrid(): Unit = {
      if (count % gridSize == 0) {
        print("\n")
      }
      print(logPile(count))
      count += 1
      if (count == logPile.size) {}
      else getStorageGrid()
    }

    def storageCalculator(): Unit = {
      if (numberOfLogs > 0) {
        if (count == logPile.size) {
          count = 0
        }
        if (logPile(count) == logPile.min) {
          logPile = logPile.updated(count, logPile(count) + 1)
          numberOfLogs -= 1
        }
        count += 1
        storageCalculator()
      } else {
        count = 0
        getStorageGrid()
      }
    }
  }

  lumberjack()
}

 