abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : FishAction by PrintingFishAction("hunt and eat fish"),
    FishColor {
    override val color = "gray"
}

class Plecostomus(fishColor: FishColor = GoldColor) :
    FishColor by fishColor,
    FishAction by PrintingFishAction("eat algae")

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

//singleton class
object GoldColor : FishColor {
    override val color = "gold"
}

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}