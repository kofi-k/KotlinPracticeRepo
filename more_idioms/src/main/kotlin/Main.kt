
fun answer() = 50 //single expression function
//is equivalent to fun answer() : Int { return 50 }

fun transform(color: String) : Int =  when(color.lowercase()) {
    in "red", "r",  -> 1
    "blue" -> 2
    "wine" -> 3
    else -> throw IllegalArgumentException("Invalid color")
}

fun swapData(a: Any, b: Any) : Any {
    var c = a
    var d = b
    c = d.also { d = c }
    return c
}

fun main(args: Array<String>) {
    println(transform("r"))
    println("answer is ${answer()}")

    //call/invoke multiple methods on an instance with 'with' keyword
    val draw = Draw()
    with(draw) {
        pendown()
        for (i in 1..4){
            for (k in 1..10){
                printLine('*')
            }
            println()

        }
       println(age)
    }
    println(swapData("swap", 10))

}