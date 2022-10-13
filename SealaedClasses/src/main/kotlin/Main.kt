fun main() {
}

//sealed classes and when expression
fun log(e: Error) = when(e) {
    is FileReadError -> { println("Error while reading file ${e.file}") }
    is DatabaseError -> { println("Error while reading from database ${e.source}") }
    RuntimeError -> { println("Runtime error") }
// the `else` clause is not required because all the cases are covered
}