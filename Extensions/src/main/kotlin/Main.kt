fun main() {
    val list = mutableListOf("world", 1, "hello")
    println(list)
    list.swap(0,2)
    println(list)

    println()
    println(Rectangle().getName())
    printClassName(Shape())

    println()
    Example().printFunctionType(7)
    Example().printFunctionType()//calls print function in class not the extension function

    var ab = null
    println(ab.toString())

    println()
    MyClass.printCompanion()

    println()
    Connection(Host("Nova"), 233).connect()
}

//declare extensions prefix its name with a receiver type dot the name
fun <T>MutableList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

//nullable receiver
fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}

//extension properties
val <T> List<T>.lastIndex: Int
    get() = size - 1

//companion object extensions
class MyClass {
    companion object { } // will be called "Companion"
}
fun MyClass.Companion.printCompanion() { println("companion") }
