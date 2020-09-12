package FunctionTypes.KT
import FunctionTypes.Java.Runnable;

val isEven : (Int) -> Boolean = { i: Int -> i % 2 == 0}

fun main(){
    println(isEven(4))
    println(isEven(5))

    val list = listOf(1, 2, 3, 4)
    println(list.any(isEven))
    println(list.filter(isEven))

    val runnable = Runnable { println(42) }
    postponecomputation(200, runnable)
    postponecomputation(1000){ println("Hello") }
}

fun postponecomputation(delay : Int, computation : Runnable){
    println(delay)
    computation.run()
}
