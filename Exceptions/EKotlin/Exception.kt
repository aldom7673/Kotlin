package Exceptions.EKotlin

import java.lang.NumberFormatException

@Throws(NumberFormatException::class)
fun bar(c : String):Int{
    try{
        return c.toInt()
    }catch(e:NumberFormatException){
        throw NumberFormatException()
    }

}