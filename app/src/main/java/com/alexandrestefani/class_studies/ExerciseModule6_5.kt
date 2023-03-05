package com.alexandrestefani.class_studies
//Exercicio 2 : Criar uma classe carro que implemente a interface veículos. Novamente usei o nome da classe em portugues para não confundir com os demais exercícios.

open class Carro(model:String): Veiculo {
    override var model = ""
    override var velocity: Long = 0

    override fun accelerate(acceleration: Long) {
        println("${this.model} :started in $velocity km/h to ${velocity+acceleration} km/h")
        velocity = velocity+ acceleration
    }

    override fun turbo(acceleration: Long) {
        println("Pay Attention!\nThe ${this.model} is in fast acceleration mode.\nStarted in $velocity km/h to ${velocity+(2*acceleration)} km/h")
        velocity = velocity+ (2*acceleration)
    }

}