fun main(args: Array<String>) {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})
    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    //lambdas
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    // val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))
    //using reference instead of function call above
    println(updateDirty(32, :: increaseDirty))

    var dirtLevel = 23
    dirtLevel = updateDirty(dirtLevel) {
        dirtLevel -> dirtLevel * 10
    }

    println(dirtLevel)
    println(decorations.filter { it.contains('p') } )
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
//single line expression function
fun increaseDirty( start: Int ) = start + 1

