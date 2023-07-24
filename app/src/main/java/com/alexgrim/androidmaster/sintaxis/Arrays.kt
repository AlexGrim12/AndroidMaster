package com.alexgrim.androidmaster.sintaxis

fun main() {
    var name: String = "AlexGrim"

    val weekDays =
        arrayOf("Monday", "Thuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday")

    //println(weekDays.size)
    //Acceder a un array
    if (weekDays.size >= 8)
        println(weekDays[7])
    else
        println("In the array aren't more values")
    //Modificar Arrays
    weekDays[0] = "Birthday"

    println(weekDays[0])

    //Bucles para Arrays

    for (position in weekDays.indices) {
        println(weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()) {
        println("La posicion $position, contiene $value")
    }

    for (weekDay in weekDays) {
        println("Ahora es $weekDay")
    }
}