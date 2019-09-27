package Day4

object LumberJack extends App {

  def storageGrid (size: Int): Unit = {
    var grid = Array.ofDim[Int](size,size)
    print(grid.map(_.mkString).mkString("\n"))

  }

  storageGrid(3)


}
