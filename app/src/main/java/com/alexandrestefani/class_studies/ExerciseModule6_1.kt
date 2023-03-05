package com.alexandrestefani.class_studies
//Exercicio 1: transformar a classe veiculo em uma classe abstrata.

abstract class Vehicle() {
    abstract var model: String
    abstract var velocity: Long

    abstract fun accelerate(acceleration: Long)
    abstract fun turbo(acceleration: Long)

    //Como essa função é comum para ambas classes (Car e Motocycle) implementei na classe abstrata pois se houver mudança de regra de negócio somente se altera em um único ponto.
    //Por mais que a literatura recomende que os metodos sejam subscritos nas classes concretas e seja evitado procedimentos diretos dela.
    fun decelerate(deceleration: Long) {
        if ((velocity - deceleration) < 0) {
            println("Started in $velocity km/h to 0 km/h")
            velocity = 0
        } else {
            println("Started in $velocity km/h to ${velocity - deceleration} km/h")
            velocity = velocity - deceleration
        }
    }
}

