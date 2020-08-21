package DefaultArguments.intro

@JvmOverloads // To provide the Overload and call the function with default values from java
fun displaySeparator(character: Char = '*', size : Int = 10){
    repeat(size){
        print(character)
    }
}
