interface Base {
    fun printMessage()
    fun printMessageLine()
    val message: String
    fun print()
}
class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
    override val message = "BaseImpl: x = $x"
    override fun print() { println(message) }
}
class Derived(b: Base) : Base by b {
    override fun printMessage() { print("abc") }
    // This property is not accessed from b's implementation of `print`
    override val message = "Message of Derived"
}