open class A(x: Int) {
    public open val y: Int = x
}

interface B { /*...*/ }
val ab: A = object : A(1), B {
    override val y = 15
}

class C {
    private fun getObject() = object {
        val x: String = "x"
    }
    fun printX() {
        println(getObject().x)
    }
}