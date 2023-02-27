package com.alexandrestefani.class_studies

import kotlin.random.Random

class RollTheDice {
    val dice1: Int
    val dice2:Int
    init {
        this.dice1 = Random.nextInt(1,6)
        this.dice2 = Random.nextInt(1,6)
    }
    fun roll(){
        println("Primeiro dado: ${this.dice1}")
        println("Segundo dado: ${this.dice2}")
        println("total: ${this.dice1+this.dice2}")
    }

}

fun main() {
    var dice=RollTheDice()
    dice.roll()

}