class FirstClass : MyInterface {
    override val prop: Int = 23
    override val propertyWithImplementation = "property wih string"
    override fun bar() = println("fun bar in class")

    override fun foo() {
        super.foo()
        println("fun foo in class")
    }
}