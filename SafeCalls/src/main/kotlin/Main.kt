fun main() {
    //sampleStart
    val a = "Kotlin"
    val b: String? = "string"
    println(b?.length)
    println(a?.length) // Unnecessary safe call
//sampleEnd
    //val l: Int = if (b != null) b.length else -1
    val l: Int = b?.length ?: -1 //elvis operator

    val n = b!!.length //non-null assertion operator

    val aInt: Int? = a as? Int

    //filter non-null elements from collection
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(nullableList)
    println(intList
    )
}
