package Extension.StringExtension

import java.lang.StringBuilder

fun String.lastChar() = get(length - 1)

fun String.repeat(n:Int) : String{
    val sb = StringBuilder(n*length)
    for(i in 1 .. n){
        sb.append(this)
    }
    return sb.toString()
}

fun List<Int>.sum():Int{
    var result = 0
    for(i in 0 until this.size ){
        result = result + this.get(i)
    }
    return result
}