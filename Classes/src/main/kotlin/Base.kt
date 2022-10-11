open class Base(val name: String) {
    init {
        println("Base class is initializing")
        printSomething()
    }
    open val size: Int = name.length.also { println("Size of $name in Base class: $it") }
    open fun printSomething(){
        println("$name from Base class")
    }
}

class Derived(
    name: String,
    private val lastName: String
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for base class: $it") }) {
    init {
        println("Derived class initializing")
        printSomething()
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Size of data in Derived class: $it") }

    override fun printSomething() { //calling superclass implementation
        super.printSomething()
        println("$name $lastName from Derived class")
    }

}