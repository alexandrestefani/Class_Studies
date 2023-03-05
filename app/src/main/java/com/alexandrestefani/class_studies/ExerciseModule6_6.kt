package com.alexandrestefani.class_studies
//Exercicio 2: Criar uma classe moto que estenda a classe veículo, com o valor da aceleração de 5

class Moto(model: String): Carro(model) {
    override var model = ""
    override var velocity: Long = 0

    override fun accelerate(acceleration: Long) {
        println("${this.model}: Started in $velocity km/h to ${velocity + 5} km/h, your motocycle arises just 5km/h")
        velocity = velocity + 5
    }
    override fun turbo(acceleration: Long) {
        println("Turbo is not avaible to Motocycle\nYour velocity is the same $velocity km/h ")
    }
}

fun main() {
    val carro = Carro("Celta")
    carro.model = "celta"
    carro.accelerate(50)
    carro.decelerate(100)
    carro.accelerate(150)
    carro.decelerate(90)
    carro.turbo(30)
    println("\n")

    val moto = Moto("CG150")
    moto.model="CG150"
    moto.accelerate(10)
    moto.turbo(10)
    moto.decelerate(10)
}