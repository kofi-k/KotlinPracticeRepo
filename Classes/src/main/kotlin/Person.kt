//all classes have a common superclass Any, and are final u
class Person(
    val name: String,
) {
    val smartPhone: MutableList<SmartPhone> = mutableListOf()
    val friends: MutableList<Person> = mutableListOf()

    constructor(name: String, person: Person) : this(name) {
       // person.smartPhone.add(SmartPhone("Samsung", true))
        person.friends.add(this)
    }

}