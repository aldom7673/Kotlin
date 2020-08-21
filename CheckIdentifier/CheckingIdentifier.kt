package CheckIdentifier
/*
* A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
* */

fun isValidIdentifier(s: String): Boolean {
    fun isValid(c : Char) =
            //c == '_' || in 'a'.. 'z' || c in 'A' .. 'Z' || c in '0' .. '9'
            c == '_' || c.isLetterOrDigit()

    //if(s == "" || s[0] in '0' .. '9') return false
    if(s == "" || s[0].isDigit() ) return false

    for(ch in s){
        if( !isValid(ch) ) return false
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}