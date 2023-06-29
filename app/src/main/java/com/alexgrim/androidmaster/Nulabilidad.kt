package com.alexgrim.androidmaster

fun main() {
    var name: String? = null

    println(name?.get(3) ?: "valor nulo")
}