package NullableTypes

fun main(args: Array<String>){
    val s1 : String = "always not null"
    val s2 : String? = null

    println(s1.length)
    println(s2?.length)

    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    /*
    *       ?: operator
    * nullVar ?: value when it's null
    * If is not null return the value from nullVar
    * */

    val s3 = (a ?: 0) + c
    val s4 = (b ?: 0) + c

    println("$s3$s4")

    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y
    println(sum)

    isEmptyOrNullTask()
}
/**
 * Nullable list and list of null elements
 */

fun foo(list1: List<Int?>, list2: List<Int>?){
    list1.size
    list2?.size

    val i: Int? = list1.get(0)
    val j: Int? = list2?.get(0)
}

fun String?.isEmptyOrNull():Boolean = this == null || this.isEmpty()

fun isEmptyOrNullTask() {
    val s1: String? = null
    val s2: String? = ""
    print(s1.isEmptyOrNull())
    print(s2.isEmptyOrNull())

    val s3 = "   "
    print(s3.isEmptyOrNull())
}