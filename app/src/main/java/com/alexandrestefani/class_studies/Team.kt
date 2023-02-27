package com.alexandrestefani.class_studies

class Team {
    var players: List<Person> = mutableListOf()
    var name: String = "" //nome do time e não o nome do jogador da classe Person

    fun getAllPlayersWithNameBiggerThan(sizename: Int) : List<Person>{
        return this.players.filter {it -> it.name.length > sizename}
    } //o name referenciado aqui é da classe Person
    fun printEmailAndPhone(): Unit {
        this.players.forEach{
            person -> println(person.getEmailAndPhone())
        }
    }
    fun printNameAndPhone():Unit{
        this.players.forEach{
            person -> println("A pessoa: ${person.name} tem o seguinte telefone ${person.phone}")
        }
    }
}

fun main() {

    var jogador = Person()
    var jogador2 = Person()
    var jogador3 = Person()
    var jogador4 = Person()
    var time1 = Team()

    jogador.name = "Wellington"
    jogador.phone = "51 99999555"
    jogador.email = "papaleguasdosgramados@gmail.com"
    jogador.age = 21
    jogador2.name = "Cleiton"
    jogador2.phone = "11 888887777"
    jogador2.email = "cleitonalgusto@gmail.com"
    jogador2.age = 23
    jogador3.name = "Andre"
    jogador3.phone ="21 979797979"
    jogador3.email = "andrezinho@gmail.com.br"
    jogador3.age = 22
    jogador4.name = "Carlos"
    jogador4.phone ="21 9797971111"
    jogador4.email = "carlos_alberto@gmail.com.br"
    jogador4.age = 20
    time1.name = "Gremio"
    var time2 = Team()
    time2.name ="Internacional"


    jogador.printSaudacao("OLA")
    jogador2.printSaudacao("Olá")
    println(jogador2.phone)
    println(jogador3.getEmailAndPhone())
    println(jogador4.olderThan(16))
    println("${time2.name} contrata o jogador ${jogador2.nameAge()} mas ${time1.name} reforça o time com o zagueiro ${jogador.nameAge()},\no meia ${jogador3.nameAge()} e o goleiro ${jogador4.nameAge()}.")







}