fun main() {
    val firstClass = FirstClass()
    firstClass.bar()
    firstClass.foo()

    //SAM use case invocation
    println("Is the number 10 even? - ${isEven.accept(10)}")
    println("Is the number 7 even? - ${isEven.accept(7)}")
}