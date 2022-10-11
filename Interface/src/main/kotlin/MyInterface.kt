interface MyInterface {
    val prop: Int //abstract
    val propertyWithImplementation: String get() = "Some string"

    fun bar()
    fun foo(){
        println(prop)
        println(propertyWithImplementation)
    }
}