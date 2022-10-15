class Outer {
    private val bar: Int = -1
    class Nested {
        fun foo() = 2
    }
    inner class Inner {
        fun foo() = bar
    }
}
//nesting classes in interface and interfaces in interfaces
interface OuterInterface {
    class InnerClass
    class InnerInterface
}

//nesting interfaces in classes and classes in classes
class OuterClass {
    class InnerClass
    interface InnerInterface
}