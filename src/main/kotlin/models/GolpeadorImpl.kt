package srangeldev.models

class GolpeadorImpl: Golpeador {
    override fun golpear() {
        println("Golpeando las Bludgers como golpeador")
    }

    override fun entrenar() {
        println("Entrenando como golpeador")
    }

    override fun jugar() {
        println("Jugando como golpeador")
    }
}