case class Estudiante(
    nombre: String,
    nota: Double
)

object Ej325 {

  def resultado(estudiante: Estudiante): String = {
    estudiante match {
      case Estudiante(_, nota) if nota >= 90 => "Excelente"
      case Estudiante(_, nota) if nota >= 70 => "Aprobado"
      case Estudiante(_, nota) if nota >= 51 => "Regular"
      case _                                 => "Reprobado"
    }
  }

  def main(args: Array[String]): Unit = {
    println(resultado(Estudiante("Ana", 95.0)))
    println(resultado(Estudiante("Luis", 78.5)))
    println(resultado(Estudiante("Marta", 55.0)))
    println(resultado(Estudiante("Pedro", 40.0)))
  }
}
