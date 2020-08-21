package Variables

fun main(){

    /*
    * Variables can be val (read-only) or var (mutable)
    * VarType variableName : DataType
    * */
    val question = "life, the universe, " + "and everything"
    println("$question")

    /*
    * question = "yes"
    * Compiler error: val cannot be reassigned, we need to use var
    * */

    val mylistmutable = mutableListOf("Java")
    mylistmutable.add("kotlin")
    println("$mylistmutable")

}