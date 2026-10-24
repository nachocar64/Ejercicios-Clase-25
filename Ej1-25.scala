case class Producto(
    nombre: String,
    precio: Double,
    stock: Int
)

object Ej125 {

  def clasificar(producto: Producto): String = {
    producto match {
      case Producto(_, _, 0) => "Sin stock"
      case Producto(_, precio, _) if precio >= 1000 => "Producto premium"
      case _  => "Producto estándar"
    }
  }

  def main(args: Array[String]): Unit = {
    val laptop: Producto = Producto("Laptop", 4500.0, 3)
    val mouse: Producto = Producto("Mouse", 80.0, 25)
    val monitor: Producto = Producto("Monitor", 1200.0, 0)

    println(clasificar(laptop))
    println(clasificar(mouse))
    println(clasificar(monitor))
  }
}
