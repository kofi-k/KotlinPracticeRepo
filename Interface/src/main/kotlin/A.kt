interface A {
    fun foo() = println("prints A")
    fun bar()//not declared as abstract
}

interface B {
    fun foo() = println("prints B")
    fun bar() = println("prints bar")
}

class C : A {
    override fun bar() {
        println("prints bar from C")
    }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}