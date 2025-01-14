package srangeldev.models

class EntrenadorImpl(
    nombre: String,
    edad: Int
) : Entrenador, Persona(nombre, edad) {
    override fun entrenar() {
        println("Entrenando como entrenador de Quidditch")
    }
}