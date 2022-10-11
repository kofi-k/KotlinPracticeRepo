open class ClassA {
    open fun printSomething(){}
}

interface myInterface {
    fun printSomething(){}
}

class childClass() : ClassA(), myInterface {
    override fun printSomething() {
        super<ClassA>.printSomething()
        super<myInterface>.printSomething()
    }
}