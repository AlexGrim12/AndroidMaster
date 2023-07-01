package com.alexgrim.androidmaster

fun main() {
    mutableList()
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Monday", "Thuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday")

    //Acceder a una lista
    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { it.contains("e") }
    println(example)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }
}

fun mutableList(){
    var weekDay:MutableList<String> = mutableListOf("Monday", "Thuesday", "Wendsday", "Thursday", "Friday", "Saturday", "Sunday")

}