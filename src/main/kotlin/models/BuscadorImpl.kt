package srangeldev.models

class BuscadorImpl: Buscador, Posicion {
    override fun capturar() {
        println("Capturando la Snitch Dorada como buscador")
    }

    override fun entrenar() {
        println("Entrenando como buscador")
    }

    override fun jugar() {
        println("Jugando como buscador")
    }
}