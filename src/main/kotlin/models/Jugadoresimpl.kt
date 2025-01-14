package srangeldev.models

class Jugadoresimpl(
    nombre: String,
    edad: Int
) : Jugadores, Persona(nombre, edad) {
    override fun entrenar() {
        println("Entrenando como Jugador de Quidditch")
    }

    override fun jugar() {
        println("Jugando como Jugador de Quidditch")
    }
}