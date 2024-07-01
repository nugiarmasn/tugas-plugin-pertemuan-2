package app

import data.car

fun main() {
    val avanza = car(paramMerek = "honda")

        println(avanza.merek)
        println(avanza.year)
}