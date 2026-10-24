case class Inventario(
    producto: String,
    cantidad: Int
)

object Ej425 {

  def agregar(inventario: Inventario, cantidad: Int): Inventario = {
    inventario.copy(cantidad = inventario.cantidad + cantidad)
  }

  def main(args: Array[String]): Unit = {
    val original: Inventario = Inventario("Teclado", 10)
    val nuevo: Inventario = agregar(original, 5)

    println(original)
    println(nuevo)
  }
}
