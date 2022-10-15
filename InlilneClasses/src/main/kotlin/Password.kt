
@JvmInline
value class Password(private val s: String)


//properties and functions
@JvmInline
value class Name(val s: String) {
    init {
        require(s.length > 0) { }
    }
    val length: Int
    get() = s.length
    fun greet() {
        println("Hello, $s")
    }
}

//inheritance
interface Printable {
    fun prettyPrint(): String
}
@JvmInline
value class Message(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}

//inline functions and delegation
interface MyInterface {
    fun bar()
    fun foo() = "foo"
}
@JvmInline
value class MyInterfaceWrapper(val myInterface: MyInterface) : MyInterface by myInterface