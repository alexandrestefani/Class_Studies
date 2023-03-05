package com.alexandrestefani.class_studies

class lateralPlayer:Player1 {
    override var name = ""
    override var number = 0
    var goalsmade =0

    override fun rating():Int{
        return when{
            goalsmade > 10 -> 10
            goalsmade > 5 -> 9
            else -> 7
        }
    }
    override fun toString()= "name:$name, number:$number,  "
}

fun main() {
    var lateral = lateralPlayer()
    lateral.name = "Pedro"
    lateral.goalsmade=7
    lateral.number=10
    println(lateral.rating())
    println(lateral.isAnExceptionalplayer())
    println(lateral)

}

