fun main() {

    val msg = basicFunction(yourName = "Joe")
    println(msg)
    println()
    println(highOrderFunction(name = "Kay", anotherFun = { names: String ->
        names.reversed()
    }))

    println(arrayOfMinusOnes(5))



}
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}


fun basicFunction(
    myName: String = "Kofi", yourName: String
): String {
    return "My name is $myName, and you are $yourName"
}

fun highOrderFunction(
    name: String, anotherFun: (String) -> String
): String {
    return anotherFun(name)
}