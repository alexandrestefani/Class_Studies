package com.alexandrestefani.class_studies

abstract class Player {
    abstract var name:String
    abstract var number: Int
    abstract fun rating(): Int

    fun isAgoodplayer(): Boolean{
        return rating() > 6
    }
}