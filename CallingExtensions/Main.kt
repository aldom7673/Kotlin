package CallingExtensions

class A{
    fun foo() = "member"
}
/*
* fun A.foo() = "new function"
* This function has not effect in the foo() member function
* We can overload but cannot replace the member functions
* */
fun A.foo(i : Int) = "member $i"

fun main(){
    val classA : A = A()
    println(classA.foo())
}