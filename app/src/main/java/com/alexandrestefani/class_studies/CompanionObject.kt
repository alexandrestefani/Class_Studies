package com.alexandrestefani.class_studies

class Persona{
    val nome = ""
    var email= ""

            companion object Manager{
                var counter=0

                fun create(): Persona{
                    counter++
                    return  Persona()
                }
            }
}

fun main() {
    val persona = Persona()
    Persona.Manager.create()
    Persona.Manager.create()
    Persona.Manager.create()
    println(Persona.counter)

}