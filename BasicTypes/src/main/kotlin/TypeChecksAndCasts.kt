import java.util.Objects

class TypeChecksAndCasts {
    fun typeChecks(obj: Any) {
        if (obj is String) { //checks pe of obj
            println(obj.length)
        }

    }
    fun castDemo(x: Any) {
        if (x is String) {
            println(x.length) // x is automatically cast to String
        }
        //smart cast work wih when expressions
        when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length + 1)
        is IntArray -> println(x.sum())
    }
    }
}