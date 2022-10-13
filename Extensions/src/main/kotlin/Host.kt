class Host(val hostName: String) {
    fun printHostName() = print(hostName)
}
class Connection(val host: Host, val port: Int) {
    fun printPort() = print(port)

    fun Host.printConnectInfo() {
        printHostName()
        print(":")
        printPort()
    }

    fun connect() = host.printConnectInfo()
}