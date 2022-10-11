class Friends(name: String) {
    val friend: MutableList<Friends> = mutableListOf()
    constructor(
        person: Person,
        name: String,
    ) : this(
        name = name,
    ) {
        friend.add(this)
    }

}