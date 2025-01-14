package srangeldev

import srangeldev.models.BuscadorImpl
import srangeldev.models.CazadorImpl
import srangeldev.models.GolpeadorImpl
import srangeldev.models.GuardapalosImpl
import srangeldev.models.JugadoresImpl

fun main() {
    val guardapalos = GuardapalosImpl()
    val cazador = CazadorImpl()
    val golpeador = GolpeadorImpl()
    val buscador = BuscadorImpl()

    //Posicion del Jugador1 como Guardapalos

    val jugador1 = JugadoresImpl("Harry Potter", 23, guardapalos)

    if (jugador1.posicion is GuardapalosImpl) {
        (jugador1.posicion as GuardapalosImpl).entrenar()
        (jugador1.posicion as GuardapalosImpl).jugar()
        (jugador1.posicion as GuardapalosImpl).defenderAros()
    }

    //Posicion del Jugador1 como Cazador
    println()
    println("Cambiando posicion del Jugador1 a Cazador")
    println()

    jugador1.posicion = cazador

    if (jugador1.posicion is CazadorImpl) {
        (jugador1.posicion as CazadorImpl).entrenar()
        (jugador1.posicion as CazadorImpl).jugar()
        (jugador1.posicion as CazadorImpl).marcarPuntos()
    }

    //Jugador1 como Golpeador
    println()
    println("Cambiando posicion del Jugador1 a Golpeador")
    println()

    jugador1.posicion = golpeador

    if (jugador1.posicion is GolpeadorImpl) {
        (jugador1.posicion as GolpeadorImpl).entrenar()
        (jugador1.posicion as GolpeadorImpl).jugar()
        (jugador1.posicion as GolpeadorImpl).golpear()
    }

    //Jugador1 como Buscador
    println()
    println("Cambiando posicion del Jugador1 a Buscador")
    println()

    jugador1.posicion = buscador

    if (jugador1.posicion is BuscadorImpl) {
        (jugador1.posicion as BuscadorImpl).entrenar()
        (jugador1.posicion as BuscadorImpl).jugar()
        (jugador1.posicion as BuscadorImpl).capturar()
    }
}