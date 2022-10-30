fun main(args: Array<String>) {
    //buildAquarium()
    //myPropFun()
    //myAbstract()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium(120, 60)
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium5 = Aquarium(numberOfFish = 29)
    aquarium5.printSize()
    //aquarium5.volume = 70 //setter property of volume is private
    aquarium5.printSize()

    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun myPropFun(){
    val myProp = MyProp(3)
    myProp.increaseHeight = 5
    println("increasedHeight ${myProp.increaseHeight}")
    println("Height ${myProp.height}")
}
fun myAbstract() {
    val babyAbstract = BabyAbstract("Kofi")
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

