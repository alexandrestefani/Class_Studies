package com.alexandrestefani.class_studies

class Vehicle(model: String) {
    val model: String
    var velocity: Long

    init{
        this.model = model
        this.velocity = 0
    }
    fun accelerate(acceleration: Long){
        println("Started in $velocity km/h to ${velocity+acceleration} km/h")
        velocity = velocity+ acceleration
    }
    fun turboAcceleration(acceleration: Long){
        println("Pay Attention!\nThe ${this.model} is in fast acceleration mode.\nStarted in $velocity km/h to ${velocity+(2*acceleration)} km/h")
        velocity = velocity+ (2*acceleration)
    }
    fun decelerate(acceleration: Long){
        if((velocity-acceleration)<0) {
            println("Started in $velocity km/h to 0 km/h")
            velocity=0
        }
        else{
            println("Started in $velocity km/h to ${velocity-acceleration} km/h")
            velocity=velocity-acceleration
        }
    }
}

fun main() {
    val vehicle = Vehicle("HB20")
    vehicle.accelerate(50)
    vehicle.decelerate(100)
    vehicle.accelerate(150)
    vehicle.decelerate(90)
    vehicle.turboAcceleration(30)
}