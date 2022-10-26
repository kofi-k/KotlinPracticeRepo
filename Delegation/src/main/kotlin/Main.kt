fun main(){
    val b = BaseImpl(10)
    Derived(b).printMessage()
    Derived(b).printMessageLine()
    val derived = Derived(b)
    derived.print()
    println(derived.message)
}