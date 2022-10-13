fun main() {
    val Kofi = User("Kofi K", 23)
    val richKofi = Kofi.copy(age = 25)
    println("""
        Name: ${Kofi.getName()}
        Age: ${Kofi.age}
    """.trimIndent())

    //destruction declarations
    val (name, age) = Kofi
    println("""
        Name is $name and age is $age
    """.trimIndent())
}

