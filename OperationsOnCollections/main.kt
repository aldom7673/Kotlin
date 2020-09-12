package OperationsOnCollections

data class Hero(
        val name : String,
        val age: Int,
        val gender : Gender?
)

enum class Gender { MALE, FEMALE}

fun main(args : Array<String>){
    val heroes = listOf( Hero("The Captain", 60, Gender.MALE),
                         Hero("Frenchy",42, Gender.MALE),
                         Hero("The kid",9, null),
                         Hero("Lady Lauger", 29, Gender.FEMALE),
                         Hero("First Mate", 29, Gender.MALE),
                         Hero("Sir Stephen", 37, Gender.MALE))
    println( heroes.first().name )

    println( heroes.last().name )

    println( heroes.firstOrNull{ it.age == 30 }?.name )

    println( heroes.map{ it.age }.distinct().size )

    println( heroes.filter { it.age < 30 }.size )

    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println( youngest.size )
    println( oldest.size )

    println( heroes.maxByOrNull { it.age }?.name)

    println( heroes.all{ it.age < 50 } )

    println( heroes.any{ it.gender == Gender.FEMALE})

    val mapByAge: Map<Int, List<Hero>> =
            heroes.groupBy { it.age }

    val (age, group) = mapByAge.maxByOrNull { (_, group) ->
        group.size
    }!!
    println(age)

    val mapByName: Map<String, Hero> =
            heroes.associateBy { it.name }
    println( mapByName["Frenchy"]?.age )

    val mapbyname = heroes.associate { it.name to it.age }
    println( mapbyname.getOrElse("unknown"){ 0 } )

    val mapByName1 = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 0, null)
    println( mapByName1.getOrElse("unknown") { unknownHero }.age )
}