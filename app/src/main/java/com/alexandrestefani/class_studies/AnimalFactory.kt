package com.alexandrestefani.class_studies

class AnimalFactory {
    fun createAnAnimal(type:Int, id: Int): Animal{
        return when (type){
            1 -> Lion(id)
            else -> Wale(id)
        }
    }
}

fun main() {
    val factory = AnimalFactory()
    val animalList: MutableList<Animal> = mutableListOf()

    for (i in 1..2){
        val animal = factory.createAnAnimal(i,i)
        animalList.add(animal)
        println(animal)
        animal.feed()
        animal.feed()
        println(animal)

            if (animal is Lion){
                animal.roar()
            }
    }


}