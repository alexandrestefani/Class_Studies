package com.alexandrestefani.class_studies

class rollDice (val numSides: Int) {
    fun roll(): Int {
        return (1..numSides ).random()
    }


}

fun main() {
    val myFirstDice = rollDice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")

    val mySecondDice = rollDice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}")
}