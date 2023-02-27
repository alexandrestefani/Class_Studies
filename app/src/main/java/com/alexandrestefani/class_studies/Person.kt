package com.alexandrestefani.class_studies

class Person {
    var name: String = ""
    var age: Int = 0
    var email:String = ""
    var phone: String = ""

    fun getEmailAndPhone(): String{
        return "email: ${this.email} phone: ${this.phone} "
    }

    fun printSaudacao(hello:String){
        println("$hello, ${this.name}")
    }

    fun olderThan(reguaIdade:Int): Boolean{
        return this.age>reguaIdade
    }
    fun nameAge(): String{
        return "${this.name} (${this.age})"

    }

}