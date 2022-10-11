fun isOdd() {

}

fun main() {
    var a = 30
    var b = 20

    // if condition as expression
    val max = if (a > b) a else b
    println(max)

    //when expression
    var x = 8
    val validNumbers = listOf(1, 3, 4, 6, 7, 8)
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        in validNumbers -> print("x is valid")
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    println()
    //loops--------------------------------------------------------------
    //for loop
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    val array = arrayOf("a", "b", "c")
    //sampleStart
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
    //labels
   /* loop@ for (i in 1..100) {
        for (j in 1..100) {
            print(".")
            if (i==2) break@loop
        }
    }*/
    foo()
    println()
    foo2()
}

fun foo() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            print(it)
        }
    }
    print(" done with nested loop")
}
fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with implicit label")
}