fun main(args: Array<String>) {
    println("Does it have spaces?".hasSpaces())

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println(plant.isGreen)
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()  // what will it print?
    aquariumPlant.isGreen

    val t = "every good boy deserves favour"
    println(t.substring(6,24))
    println(t.substring(18,1))
    println(t.substring(startIndex = 23, endIndex = 7))
    println(t.length)

}
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

//fun String.hasSpaces() = find { it == ' ' } != null //simplified

fun spaceToUnderscore (text: String) {
      var under =  text.forEach { if (it.isWhitespace())  '_' }
    println(under)
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

//extension functions
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

//extension property
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}


