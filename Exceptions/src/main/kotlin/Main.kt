

fun main() {
    val person = Person()
    //person.name = "kofi"
    val s = person.name ?: fail("Name required")
    println(s)
}
//the nothing type
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

class Person {
    var name: String? = null
    //fun doSomething(){}
}