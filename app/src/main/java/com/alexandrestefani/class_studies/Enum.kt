package com.alexandrestefani.class_studies

enum class Season(val translateToPortughese: String) {
    SPRING ("Primavera") {
        override fun hello() = println("hello Spring")
    },
    SUMMER("verão"){
        override fun hello() = println("hello Summer")
    },
    FALL("outono"){
        override fun hello() = println("hello Fall")
    },
    WINTER("inverno") {
        override fun hello() = println("hello Winter")
    };
    abstract fun hello()
}

fun main() {
    val summer = Season.SUMMER
    println(summer)
    println(Season.SPRING.translateToPortughese)
    summer.hello()
    var season = Season.SUMMER
    season = Season.WINTER

    when(season){
        Season.SUMMER -> println("its summer!")
        Season.SPRING -> println("its Spring!")
        Season.FALL -> println("its Fall!")
        Season.WINTER -> println("its Winter!")
    }
    Seasonlist.currentSeason()
    Seasonlist.setSeason(Season.SPRING)
    Seasonlist.currentSeason()
    Seasonlist.setSeason(Season.WINTER)
    Seasonlist.currentSeason()
    Seasonlist.setSeason(Season.SUMMER)
    Seasonlist.currentSeason()
    Seasonlist.setSeason(Season.FALL)
    Seasonlist.currentSeason()
    Seasonlist.setSeason(Season.SPRING)
    Seasonlist.currentSeason()


}

object Seasonlist{
    private var season= Season.WINTER

    fun setSeason(newSeason: Season){
        this.season = newSeason
    }
    fun currentSeason() = println(season)
}