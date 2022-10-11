fun main() {

    val trickFunc = trickOrTreat(true, null)
    val treatFunc = trickOrTreat(false)  {"$it quarters"}

    treatFunc()
    trickFunc()

}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) ->String)?): () -> Unit {
    return if (isTrick) {
        trick
    }
    else {
        if (extraTreat != null){
            println(extraTreat(5))
        }
        treat
    }
}

val trick = {
    println("No treats!")
}
val treat: () -> Unit = {
    println("Have a treat!")
}