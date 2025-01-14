package srangeldev.models

class CazadorImpl: Cazador, Posicion {
    override fun marcarPuntos() {
        println("Marcando puntos como cazador")
    }

    override fun entrenar() {
        println("Entrenando como cazador")
    }

    override fun jugar() {
        println("Jugando como cazador")
    }
}