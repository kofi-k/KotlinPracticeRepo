package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }
    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericsExample() {
    val aquarium = Aquarium(waterSupply = TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    addItemTo(aquarium)
    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner = cleaner)
    isWaterClean(aquarium)
    println(aquarium.hasWaterSupplyOfType<TapWater>())
    println(aquarium.waterSupply.isOfType<LakeWater>())

    /* val aquarium2 = Aquarium(LakeWater())
     aquarium2.waterSupply.filter()
     println(aquarium2.waterSupply)*/

}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

interface Cleaner <in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) =   waterSupply.addChemicalCleaners()
}

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}