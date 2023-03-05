package com.alexandrestefani.class_studies
// Exercício 2: Transformar a classe Veiculo em uma interface
// Obs.: Tomei a liberdade de escrever em portugues o nome da variável para não confundir com o exercicio1 do modulo 6.

interface Veiculo{
    var model: String
    var velocity: Long

    fun accelerate(acceleration:Long)
    fun turbo(acceleration: Long)
    fun decelerate(deceleration: Long) {
        if ((velocity - deceleration) < 0) {
            println("${this.model}: started in $velocity km/h down to 0 km/h")
            velocity = 0
        } else {
            println("${this.model}: started in $velocity km/h down to ${velocity - deceleration} km/h")
            velocity = velocity - deceleration
        }
    }

}