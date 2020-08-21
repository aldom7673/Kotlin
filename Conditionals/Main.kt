package Conditionals
import Conditionals.Color.*
import java.lang.Exception

/*
*  When
* */
fun getDescription(color : Color) : String =
    when(color){
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
        else -> " -- "
    }

/*
* Checking values
* */
fun respondToInput(input : String) = when(input){
    "y","yes"-> "I'm glad you agree"
    "n", "no" -> "Sorry to hear that"
    else -> "Please type again"
}

/*
* Branch condition
* */
fun mix(c1: Color, c2 : Color) =
        when( setOf(c1,c2)){
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }
/*
* When without argument
* */
fun updateWeather(degrees : Int){
    val (descriptioin, color) = when {
        degrees < 5 -> "cold" to BLUE
        degrees < 23 -> "mild" to ORANGE
        else -> "hot" to RED
    }
    print(descriptioin + color)
}

fun main(){
    println( getDescription(RED) )
    println( respondToInput("n"))
    println( mix(BLUE, YELLOW) )
    //println( mix(RED, INDIGO) )
    println( updateWeather(12) )
}