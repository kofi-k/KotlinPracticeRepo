import kotlin.math.abs
import kotlin.math.cos

class MyStringCollection {
    infix fun add(s: String) { /*...*/ }
    fun build() {
        this add "abc" // Correct
        add("abc") // Correct
//add "abc" // Incorrect: the receiver must be specified
    }
}

const val eps = 1E-10 // "good enough", could be 10^-15
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))


class HTML {
    fun body() { }
}
fun html(init: HTML.() -> Unit): HTML {
    val html = HTML() // create the receiver object
    html.init() // pass the receiver object to the lambda
    return html
}
