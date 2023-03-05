package com.alexandrestefani.class_studies

class Wale(id: Int): Animal(id) {
    override var minEnergy= 130

    override fun feed() {
        this.energy = energy + 150
    }

    override fun play() {
        this.energy = energy - 135

    }
}