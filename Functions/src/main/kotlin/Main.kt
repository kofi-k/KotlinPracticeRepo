fun main() {
    println(double(10))
    foo(1) { println("hello") } // Uses the default value baz = 1
    foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    foo { println("hello") } // Uses both default values bar = 0 and baz = 1

    println("======================================NEW CODE STARTING POINT============================================")

    //You can skip all the ones with default values:
    reformat("This is a long String!")
    val list = asList(1, 2, 3)
    println(list)

    println()
    println("======================================NEW CODE STARTING POINT============================================")

    //sampleStart
    val items = listOf(1, 2, 3, 4, 5)
    // Lambdas are code blocks enclosed in curly braces.
    items.fold(0) {
        // When a lambda has parameters, they go first, followed by '->'
            acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // The last expression in a lambda is considered the return value:
        result
    }
    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:") { acc, i -> "$acc $i" }
    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)
    //sampleEnd
    println("joinedToString = $joinedToString")
    println("product = $product")
    println()
    println("======================================NEW CODE STARTING POINT============================================")

    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun // OK
    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }

    val result = runTransformation(repeatFun) // OK
    //sampleEnd
    println("result = $result")

    println()
    println("======================================NEW CODE STARTING POINT============================================")
    //sampleStart
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus
    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))
    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call
    //sampleEnd

    println()
    println("======================================NEW CODE STARTING POINT============================================")





    println()
    println("======================================NEW CODE STARTING POINT============================================")

}

fun double(x: Int) = x * 2

fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) {
}
//=================================================================================================================

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) { /*...*/
}
//=================================================================================================================

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}