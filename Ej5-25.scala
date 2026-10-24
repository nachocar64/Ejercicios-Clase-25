case class Direccion(
    ciudad: String,
    pais: String
)

case class Cliente(
    nombre: String,
    direccion: Direccion
)

object Ej525 {

  def ubicacion(cliente: Cliente): String = {
    cliente match {
      case Cliente(_, Direccion(_, "Bolivia")) => "Cliente boliviano"
      case _  => "Cliente extranjero"
    }
  }

  def main(args: Array[String]): Unit = {
    val clienteBoliviano: Cliente = Cliente("Ignacio", Direccion("La Paz", "Bolivia"))
    val clienteExtranjero: Cliente = Cliente("Sofía", Direccion("Lima", "Perú"))

    println(ubicacion(clienteBoliviano))
    println(ubicacion(clienteExtranjero))
  }
}
