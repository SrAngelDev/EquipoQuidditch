package srangeldev.models

class GuardapalosImpl : Guardapalos, Posicion{
    override fun defenderAros() {
        println("Defendiendo los Aros como Guardapalos")
    }

    override fun entrenar() {
        println("Entrenando como Guardapalos")
    }

    override fun jugar() {
        println("Jugando como Guardapalos")
    }
}