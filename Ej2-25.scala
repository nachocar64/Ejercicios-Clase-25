object Ej225 {

  def posicion(punto: (Int, Int)): String = {
    punto match {
      case (0, 0) => "Origen"
      case (0, y) => "Eje Y"
      case (x, 0) => "Eje X"
      case (x, y) => "Otro punto"
    }
  }

  def main(args: Array[String]): Unit = {
    println(posicion((0, 0)))
    println(posicion((0, 5)))
    println(posicion((3, 0)))
    println(posicion((2, 7)))
  }
}
