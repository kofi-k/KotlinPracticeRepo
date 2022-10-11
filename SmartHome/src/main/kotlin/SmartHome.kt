class SmartHome(private val smartTvDevice: SmartTvDevice, private val smartLightDevice: SmartLightDevice) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        when (smartTvDevice.deviceStatus) {
            "off".lowercase(), "online".lowercase() -> {
                deviceTurnOnCount++
                smartTvDevice.turnOn()
            } else -> {
            //do nothing
        }
        }
    }

    private fun turnOffTv() {
        when (smartTvDevice.deviceStatus) {
            "On".lowercase() -> {
                deviceTurnOnCount--
                smartTvDevice.turnOff()
            }
            else -> {
                //do nothing
            }
        }

    }
    fun printSmartLightInfo() {
        smartLightDevice.printDeviceInfo()
    }

    fun printSmartTvInfo() {
        smartTvDevice.printDeviceInfo()
    }

    fun increaseTvVolume() {

        when (smartTvDevice.deviceStatus) {
            "On".lowercase() -> {
                smartTvDevice.increaseSpeakerVolume()
            }
            else -> {
                //do nothing
            }
        }
    }
    fun decreaseTvVolume() {

        when (smartTvDevice.deviceStatus) {
            "On".lowercase() -> {
                smartTvDevice.decreaseSpeakerVolume()
            }
            else -> {
                //do nothing
            }
        }
    }

    fun changeTvChannelToNext() {

        when (smartTvDevice.deviceStatus) {
            "On".lowercase() -> {
                smartTvDevice.nextChannel()
            }
            else -> {
                //do nothing
            }
        }

    }
    fun changeTvChannelToPrevious() {
        when (smartTvDevice.deviceStatus) {
            "On".lowercase() -> {
                smartTvDevice.previousChannel()
            }
            else -> {
                //do nothing
            }
        }

    }

    fun turnOnLight() {
        when (smartLightDevice.deviceStatus) {
            "off".lowercase(), "online".lowercase() -> {
                deviceTurnOnCount++
                smartLightDevice.turnOn()
            }
            else -> {
                //do nothing
            }
        }

    }

    private fun turnOffLight() {
        when (smartLightDevice.deviceStatus) {
            "On".lowercase() -> {
                deviceTurnOnCount--
                smartLightDevice.turnOff()
            }
            else -> {
                //do nothing
            }
        }
    }

    fun increaseLightBrightness() {
        when (smartLightDevice.deviceStatus) {
            "On".lowercase() -> {
                smartLightDevice.increaseBrightness()
            }
            else -> {
                //do nothing
            }
        }

    }

    fun turnOffAllDevices() {

        turnOffTv()
        turnOffLight()
    }
}
