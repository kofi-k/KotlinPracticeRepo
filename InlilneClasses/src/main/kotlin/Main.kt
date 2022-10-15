fun main() {
    val securePassword = Password("Don't try this in production")
    println(securePassword)

    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method

    val message = Message("Kotlin")
    println(message.prettyPrint()) // Still called as a static method

    val my = MyInterfaceWrapper(object : MyInterface {
        override fun bar() {}
    })
    println(my.foo()) // prints "foo"
}