package com.alexandrestefani.class_studies

abstract class Animal(val id: Int) {
    var energy: Int =0
    abstract var minEnergy: Int

    abstract fun feed()
    abstract fun play()
    fun isHungry(): Boolean = energy < minEnergy
    override fun toString() = "$id - Energy: $energy, Is hungry?: ${isHungry()}"

}
