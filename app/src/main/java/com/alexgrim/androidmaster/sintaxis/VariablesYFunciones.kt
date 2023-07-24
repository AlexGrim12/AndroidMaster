package com.alexgrim.androidmaster.sintaxis

//Variables

fun main() {
    showMyName()
    showMyAge()
    add(1, 2)
    val mySubstract = substract(10, 5)
    println(mySubstract)

}

fun showMyName() {
    println("My name is Alex")
}

fun showMyAge(currentAge: Int = 18) {
    println("I'm $currentAge years")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int): Int {
    return (firstNumber - secondNumber)
}

fun substractCool(firstNumber: Int, secondNumber: Int) = (firstNumber - secondNumber)

fun variablesNumericas() {
    //
    //Variables NUMERICAS
    //

    //Int
    val age: Int = 30
    var age2: Int = 30
    //println(age2)
    age2 = 18
    //println(age2)

    //Long
    val example: Long = 30

    //float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.123109
}

fun variablesAlfanumericas() {
    //
    //Variables ALFANUMERICAS
    //

    //Char
    val charExample: Char = 'A'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "AlexGrim12"

}

fun variablesBoolean() {
    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false

    //print(booleanExample)
}

fun variablesAritmeticas() {
    //
    //Variables Aritmeticas
    //

//    println("Sumar: " + (age + age2))
//    println("Restar: " + (age - age2))
//    println("Multiplicar: " + (age * age2))
//    println("Dividir: " + (age / age2))
//    println("Modulo: " + (age % age2))
}