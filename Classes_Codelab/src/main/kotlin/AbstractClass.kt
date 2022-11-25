abstract class AbstractClass (var variable: Any) {
    abstract var prop1: Int//open to subclasses
    var prop2: Any //not open yo subclasses
        get() = "$variable"
        set(value) {
            when(value) {
                is String -> value.length
                is Int -> value.toInt()
                else -> "unknown"
            }
        }
    init {
        println("""
            prop1 is $prop1 
            prop2 is $prop2
        """.trimIndent())
    }
}

class BabyAbstract (var name: String) : AbstractClass (variable = name) {
    override var prop1: Int = 23

}