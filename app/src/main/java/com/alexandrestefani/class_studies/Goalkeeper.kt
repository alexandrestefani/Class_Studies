package com.alexandrestefani.class_studies

class Goalkeeper: Player() {
    override var name = ""
    override var number = 0
    var goalsconced =0

    override fun rating():Int{
        return when{
            goalsconced < 10 -> 10
            goalsconced < 15 -> 9
            goalsconced < 20 -> 7
            goalsconced < 30 -> 6
            else -> 5

        }
    }

}

fun main() {
    var goalkeeper = Goalkeeper()
    goalkeeper.goalsconced=25
    println(goalkeeper.rating())
    println(goalkeeper.isAgoodplayer())

}