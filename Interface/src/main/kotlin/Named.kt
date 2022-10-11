import javax.swing.text.Position

interface Named {
    val named: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val named: String
        get() = "$lastName, $firstName"
}

data class Employee(
    override val firstName: String,
    override val lastName: String,
    val position: Position
) : Person