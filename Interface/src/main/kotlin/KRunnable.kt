//SAM (single abstract method) interface: interface with only one abstract method. it can have multiple non-abstract methods if necessary
fun interface KRunnable {
    fun invoke()
}

//use cases
fun interface IntPredicate {
    fun accept(number: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 } //it represents number
