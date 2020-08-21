package loops

/*
* While and do while are the same as Java
* */

fun main(){
/*
* Iteration over something
* */
    val list = listOf("a","b","c")
    for(s in list){
        println(s)
    }
/*
* Iteration over map
* */
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for( (key, value) in map){
        println("$key = $value")
    }
/*
* Iterating with index
* */
    for( (i, element) in list.withIndex() ){
        println("$i : $element")
    }
/*
* Iterating over range
* */
    for( i in 1 .. 9){
        print(i) // 1 to 9
    }
    println("")

    for(i in 1 until 9){
        print(i) // 1 to 8
    }
    println("")

    for( i in 9 downTo 0 step 2){
        print(i) // 9 to 0 with step of 2
    }
    println("")

    for(ch in "abc"){
        print(ch + 1) // bcd
    }
}