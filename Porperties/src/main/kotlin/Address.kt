class Address {
    var name: String = "Kofi, K"
    var street: String = "Baago"
    var city: String = "Accra"
    var state: String? = null
    var zip: String = "112233"

    fun copyAddress(address: Address): Address {
        val result = Address()
        result.name = address.name
        result.street = address.street
        result.state = address.state
        result.zip = address.zip
        result.city = address.city
        return result.also {
            println("Copying address with name ${address.name} of ${address.street} street in the city of ${address.city} and with ${address.zip} zip code")
        }
    }

}