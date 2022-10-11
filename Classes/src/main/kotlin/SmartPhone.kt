class SmartPhone(
    name: String,
    var isOn: Boolean = false,
) {
    val phoneName = "Name: ${name.uppercase()}".also (::println)
    init {
        if (isOn) println("$name is on") else println("$name is off")
        println("First initializer block prints $name")
    }
    val nameLength = "$name is ${name.length} characters long".also (::println)
    init {
        println("Second initializer block prints $name's character length")
        saveContact()
    }
    constructor(person: Person, name: String) : this(name = name){
        person.smartPhone.add(this)
    }
    private fun saveContact(){
        println("contact saved")
    }
}

