package com.alexandrestefani.class_studies

class SoccerPlayers: Person()  {
    var number: Int =0

    override fun toString() = super.toString()+"Number: ${this.number}"
}


fun main() {
    var person = Person()
    person.name = "Paulo"
    person.age = 18
    person.email = "pauloteste@test.com"
    person.phone = "21 989897878"

    var player = SoccerPlayers()
    player.number= 12

    println(person)
    print(player)
    if (player is Person){
        println("\né uma pessoa")
    }
}