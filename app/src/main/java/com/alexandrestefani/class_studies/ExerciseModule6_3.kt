package com.alexandrestefani.class_studies
//Exercicio 1: Criar uma classe moto que estenda a classe veículo, com o valor da aceleração de 5.

class Motocycle():Vehicle() {
    override var model = ""
    override var velocity: Long = 0

    override fun accelerate(acceleration: Long) {
        println("${this.model}: Started in $velocity km/h to ${velocity + 5} km/h, in your motocycle you arise 5km/h")
        velocity = velocity + 5
    }

    override fun turbo(acceleration: Long) {
        println("It is not avaible to Motocycle\nYour velocity is the same $velocity km/h ")
    }


}