fun main(args: Array<String>) {
    val numbers = Numbers()
    with(numbers) {
        println(oneMillion * creditCardNumber)
    }

    //strings and things
    val str = "someString"
    for (c in str) println(c)

    println(str.uppercase()) // Create and print a new String object
    println(str) // The original string remains the same

    val s = "abc" + 1
    println(s + "def")

    val text = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()
    println(text)
    //----------------end of strings-------------------
    println()
    val typeChecksAndCasts = TypeChecksAndCasts()
    typeChecksAndCasts.typeChecks("ouyolkjnlk")
    typeChecksAndCasts.castDemo(980)
}