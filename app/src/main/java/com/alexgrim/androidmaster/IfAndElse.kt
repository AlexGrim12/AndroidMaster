package com.alexgrim.androidmaster

fun main() {
    ifMultipleOr()
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy))
        println("Es un gato o un perro")
}

fun ifMultiple() {
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy)
        println("Puedo beber")
    else
        println("No puedo beber")
}

fun ifInt() {
    var age = 18

    if (age >= 18)
        println("Beber cerveza")
    else
        println("Beber jugo")
}

fun ifBoolean() {
    var soyFeliz = true

    if (!soyFeliz)
        println("Estoy triste :(")
}

fun ifAnidado() {
    val animal = "ballena"

    if (animal == "dog")
        println("Es un perrito")
    else if (animal == "cat")
        println("Es un gatito")
    else if (animal == "bird")
        println("Es un pajarito")
    else
        println("No es un animal del listado")
}

fun ifBasico() {
    val name = "Alex"
    if (name == "Alex")
        println("Oye, la variable name es ALEX")
    else
        println("Oye, la variable name NO es ALEX")
}