package Day4

object LumberJack extends App {
  var gridSize: Int = 3
  var numberOfLogs = 7
  var logPile: Seq[Int] = Seq(1, 1, 1, 2, 1, 3, 1, 4, 1)
  var count = 0

  def getStorageGrid(): Unit = {
    if (count % gridSize == 0) {
      print("\n")
    }
    print(logPile(count))
    count += 1
    if (count == logPile.size) {}
    else getStorageGrid()
  }

  getStorageGrid()

}

 