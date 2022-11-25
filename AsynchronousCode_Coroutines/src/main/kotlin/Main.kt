import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            val job = launch {
                println(getHumidity())
            }
            launch {
                printForecast()
            }
            launch {
                printTemperature()
            }
            delay(200)
            job.cancel()
            println(getWeatherReport())
            println("Have a good day!")
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}

suspend fun getForecast(): String {
    delay(1000)
    return "Mostly clear"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "24\u00b0C"
}

suspend fun getHumidity(): String {
    delay(1000)
    return "90%"
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"
}