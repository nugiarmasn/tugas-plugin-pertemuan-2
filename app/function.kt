package app

import data.person

fun main() {
    var armas = person()
    armas.firstName = "armas"
    armas.middleName = "Nugi"
    armas.LastName = "gani"

    armas.sayHello("ryan")
    armas.run()
}