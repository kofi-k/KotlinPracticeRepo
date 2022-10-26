import java.io.File

fun openFIle(name: String) : Int? {
    val file = File(name).listFiles()

    //using if-not-null shorthand ' ?. '
    //return file?.size //return size if file is not null r empty

    //using if-not-null-else shorthand ' ?:
    return file?.size?: 500 //returns 500 if file is null
}

fun getFirstItem() {
    val emails = listOf(null) //null collection
    val mainMAil = emails.firstOrNull() ?: "is null" //returns is null if emails collection is  null
    println(mainMAil)
}

fun ifNotNull (data: Any) {
    //execute if data is not null
    data?.let {
        println("$it not null")
    }
}

fun main(args: Array<String>) {
    println( openFIle("kofi") )
    getFirstItem()
    ifNotNull("text")
    println()
    println("=================================================== NEW CODE POINT ===================================================")
    //sampleStart
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        print("String of length ${b.length}") //safe call b.length
    } else {
        print("Empty string")
    }
//sampleEnd

    println()
    println("=================================================== NEW CODE POINT ===================================================")
    //sampleStart
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
//sampleEnd
    println()
    println("=================================================== NEW CODE POINT ===================================================")
    //Elvis operator
    //val l: Int = if (b != null) b.length else -1
    val l = b?.length ?: -1
    //val l = b!!.length //not null assertion 
}
