class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
    //name of the companion object can be omitted, in which case the name Companion will be used:
    //companion object { }
}