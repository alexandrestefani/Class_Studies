package com.alexandrestefani.class_studies

import kotlin.random.Random

class Account(name: String) {
    var name: String
    private var balance: Double
    private var id: Int

    init {
        this.name=name
        this.balance = 0.0
        this.id = Random.nextInt(0,100)
    }
    fun print(){
        println("Cliente: ${this.name} , conta n° ${this.id}, saldo: ${this.balance}")
    }
    fun deposit(amount: Double){
        println("\nComprovante de depósito: ${this.name}, conta:${this.id} ")
        println("saldo ant.: ${this.balance}")
        balance = balance + amount
        println("          + $amount")
        println("saldo atl.: ${this.balance}")
    }
    fun withdraw(amount2: Double){
        println("\nComprovante de retirada: ${this.name}, conta:${this.id} ")
        if(amount2 > balance){
            println("Saldo Insuficiente: seu saldo é ${this.balance}")
        }
        else{
            println("saldo ant.: ${this.balance}")
            balance = balance - amount2
            println("          - $amount2")
            println("saldo atl.: ${this.balance}")
        }
    }
}

fun main() {
    var conta = Account("Felipe")
    var conta2 = Account("Leonardo")

    conta.print()
    conta.deposit(100.00)
    conta.withdraw(90.00)
    conta.withdraw(50.00)
    conta2.print()
    conta2.deposit(125.00)
    conta2.deposit(75.00)
    conta2.withdraw(5.25)
    conta2.withdraw(70.00)



}