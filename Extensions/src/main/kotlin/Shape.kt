open class Shape
class Rectangle : Shape()

fun Shape.getName() = "Shape" //extension
fun Rectangle.getName() = "Rectangle" //extension

fun printClassName(shape: Shape) {
    println(shape.getName())
}

class Example {
    fun printFunctionType() = println("Class method")
}

fun Example.printFunctionType(i: Int) = println("Extension function #$i")
fun Example.printFunctionType() = println("Extension function without param")
