fun main() {
    println(Outer.Nested().foo())
    println(Outer().Inner().foo())

    val a = 13
    val b = 31
    for (f in IntArithmetics.values()) {
        println("$f($a, $b) = ${f.apply(a, b)}")
    }
}