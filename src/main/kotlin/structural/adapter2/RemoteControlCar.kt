package structural.adapter2

import java.util.logging.Level
import java.util.logging.Logger

class RemoteControlCar : ToyCar {
    override fun accelerates() {
        logger.log(
            Level.INFO, """is also Accelerating using batteries... 
 ----------------------------------------------------------------------------------------"""
        )
    }

    companion object {
        private val logger = Logger.getLogger(RemoteControlCar::class.java.name)
    }
}
