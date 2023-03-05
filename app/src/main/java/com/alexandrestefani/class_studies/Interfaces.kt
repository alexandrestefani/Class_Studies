package com.alexandrestefani.class_studies

interface Player1 {
    val name: String
    val number: Int
    fun rating(): Int

    fun isAnExceptionalplayer(): Boolean {
        return rating() > 7
    }
}