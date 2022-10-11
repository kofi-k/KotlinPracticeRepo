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
}