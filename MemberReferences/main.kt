package MemberReferences
class Person(val name: String, val age: Int){
    fun isOlder(ageLimit: Int) = age > ageLimit
    fun getAgePredicate()  = this::isOlder
}

fun main(){
    val agePredicate = Person :: isOlder
    //val agePredicate: (Person, Int) -> Boolean = Person::isOlder
    //val agePredicate: (Person, Int) -> Boolean = { person,ageLimit -> person.isOlder(ageLimit) }
    val alice = Person("Alice", 29)
    println( agePredicate(alice,21) )

    val agePredicate2 = alice::isOlder
    //val agePredicate2 : (Int) -> Boolean = alice::isOlder
    //val agePredicate2 : (Int) -> Boolean = {ageLimit -> alice.isOlder(ageLimit) }
    println( agePredicate2(31) )

    val predicate = alice.getAgePredicate()
    println( predicate(22) )
}