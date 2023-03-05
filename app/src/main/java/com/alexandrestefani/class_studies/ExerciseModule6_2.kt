package com.alexandrestefani.class_studies
// Exercicio 1: criar uma classe Carro que estenda de Veiculo

class Car(): Vehicle() {
    override var model = ""
    override var velocity: Long = 0

    override fun accelerate(acceleration: Long) {
        println("${this.model}: Started in $velocity km/h to ${velocity+acceleration} km/h")
        velocity = velocity+ acceleration
    }

    override fun turbo(acceleration: Long) {
        println("Pay Attention!\nThe ${this.model} is in fast acceleration mode.\nStarted in $velocity km/h to ${velocity+(2*acceleration)} km/h")
        velocity = velocity+ (2*acceleration)
    }

}

fun main() {
    val car = Car()
    car.model="HB20"
    car.accelerate(50)
    car.decelerate(100)
    car.accelerate(150)
    car.decelerate(90)
    car.turbo(30)
    println("\n")

    val motocycle=Motocycle()
    motocycle.model = "CG500"
    motocycle.accelerate(10)



}






