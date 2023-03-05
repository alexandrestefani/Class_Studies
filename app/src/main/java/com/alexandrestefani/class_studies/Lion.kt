package com.alexandrestefani.class_studies

class Lion(id: Int): Animal(id) {
    override var minEnergy = 2
    override fun feed(){
        this.energy++
    }

    override fun play() {
        this.energy--
    }
    fun roar(){
        println("o leaozinho faz roauuu")
    }


}

fun main() {
    val lion = Lion(1)
    val wale = Wale(2)



    println("lion:$lion")
    lion.feed()
    lion.feed()
    lion.feed()
    lion.play()
    println("lion:$lion")
    println("wale: $wale")
    wale.feed()
    wale.play()
    wale.play()
    println("wale: $wale")

    val animalList: List<Animal> = listOf(lion, wale)
    animalList.forEach{
        animal ->
            println(animal)
            animal.feed()
            println(animal)

            if( animal is Lion){
                animal.roar()
            }

    }



}