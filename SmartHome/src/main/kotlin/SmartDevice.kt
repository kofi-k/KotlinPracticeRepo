
open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType: String = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
    open fun printDeviceInfo() {
        println("Device name: $name\nCategory: $category\nDevice type: $deviceType")
    }
}
