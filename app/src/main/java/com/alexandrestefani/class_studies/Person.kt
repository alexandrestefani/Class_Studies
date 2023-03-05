package com.alexandrestefani.class_studies

open class Person {
    var name: String = ""
    var age: Int = 0
    var email:String = ""
    var phone: String = ""

    override fun toString() = "name: $name, age:$age, E-mail:$email, phone:$phone"

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