fun main() {
    val helloWorld = object {
        val hello = "Hello"
        val world = "World"

        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
    }
    println(helloWorld)
    println(ab.y)
    C().printX()
    val instance = MyClass.create()
    println(instance)

}

