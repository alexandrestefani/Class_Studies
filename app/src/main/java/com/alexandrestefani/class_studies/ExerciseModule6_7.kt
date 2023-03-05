package com.alexandrestefani.class_studies
// Exercicio 3 : Crie uma lista do tipo veiculo, utilizando Factory crie uma moto e um carro e adicione eles na lista
//               Percorra a lista e utilize o método de acelerar em cada item dela
//               Imprima a velocidade de cada veiculo da lista

class VehicleFactory {
    fun createAVehicle(type:Int): Vehicle{
        return when (type){
            1 -> Car()
            else -> Motocycle()
        }
    }

}

fun main() {
    val factory = VehicleFactory()
    val vehicleList: MutableList<Vehicle> = mutableListOf()

    for (i in 1..2) {
        val vehicle = factory.createAVehicle(i)
        vehicleList.add(vehicle)
        vehicle.model= "modelo_"+i
        vehicle.accelerate(10)
    }

    vehicleList.forEach{
        vehicle -> vehicle.accelerate(5)
    }
    println("\n_______________________________________\nList of Vehicles with theirs velocities  ")
    vehicleList.forEach{
        vehicle -> println("  ${vehicle.model}, ${vehicle.velocity} km/h")
    }
}