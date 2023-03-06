package com.alexandrestefani.class_studies

data class Book (val autor: String,val title: String) {
}

fun main() {
    val book = Book("Dante", "Divine Comedy")
    println(book)

    println(book.component1())
    val (autor, title)= book
    println(autor)

}