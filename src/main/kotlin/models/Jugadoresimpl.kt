package srangeldev.models

open class JugadoresImpl(
    nombre: String,
    edad: Int,
    var posicion: Posicion,
) : Jugadores, Persona(nombre, edad) {
    override fun entrenar() {
        println("Entrenando como Jugador de Quidditch")
    }

    override fun jugar() {
        println("Jugando como Jugador de Quidditch")
    }
}