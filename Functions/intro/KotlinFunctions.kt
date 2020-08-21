package Functions.intro

/*
* Alternative sintax
* fun max(a:Int, b:Int) = if (a > b) a else b
*
* The data type :Unit is an analogue of void
* */
fun max(a:Int, b:Int):Int{
    return if(a > b) a else b
}

fun displayMax(a:Int,b: Int){
    println(max(a, b))
}
/*
* print (abc)
* */
fun joinList(){
    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
}