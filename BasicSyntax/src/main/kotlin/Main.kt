import java.io.File

fun printInfo(name: String): String {
    return "Hello, $name"
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//a function expression, has an inferred return type to 'Int'
fun sum2(a: Int, b: Int) = a + b

//more expressive functions with if condition
fun maxValue(a: Int, b: Int) = if (a >= b) a else b

//when block
fun describeObjectType(obj: Any): String = when (obj) {
    is Int -> "$obj is Int"
    is Boolean -> "$obj is Boolean"
    is String -> "$obj is String"
    else -> "Other"
}

fun main(args: Array<String>) {
    println(printInfo("Kofi"))
    println(sum(4, 10))

    //instance of MinToSec class
    val time = MinToSec(90)
    println("90min  = ${time.convert}secs")
    println(maxValue(44, 45))

    //lists and for loops
    val fruits = listOf("mango", "orange", "apple", "banana")
    for (fruit in fruits) {
        println("\t${fruits.indexOf(fruit) + 1}.\t $fruit")
    }
    println(describeObjectType("kofi"))
    println(describeObjectType(false))
    println(describeObjectType(899L))

    println()
    //ranges
    if (fruits.size !in fruits.indices) {
        println("list size '${fruits.size}' is out of valid list indices range [${fruits.indices}]")
        fruits
            .map { it.uppercase() }
            .sortedBy { it }
            .forEach { print("${it}\t\t") }
    } else {
        fruits.forEach { fruit -> fruit.uppercase() }
    }
    println()
    val map = mapOf("one" to 1, "two" to 2, "three" to 3) //key to value pair
    println(map.keys) //prints strings eg one
    println(map.values) //prints int eg 1
    println(map.getValue("three"))
}