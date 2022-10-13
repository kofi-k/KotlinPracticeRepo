data class User(
    val name: String,
    var age: Byte,
)

fun User.getName(): String {
    return this.name
}