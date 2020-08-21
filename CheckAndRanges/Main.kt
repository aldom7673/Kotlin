package CheckAndRanges

fun isNotDigit(c:Char) = c !in '0' .. '9'

fun recognize(c:Char) = when(c){
    in '0' .. '9' -> "It's a digit"
    in 'a' .. 'z', in 'A' .. 'Z' -> "It's a letter"
    else -> "IDK"
}

fun main(){
    println( isNotDigit('x') )
    println( recognize('3') )
    println( recognize('a') )
    println( recognize('-') )
    println( "ball" in "a" .. "k" ) // True the letters of ball are in the range
    println( "zoo" in "a" .. "k" ) // False, the letters of zoo are not in the range
}