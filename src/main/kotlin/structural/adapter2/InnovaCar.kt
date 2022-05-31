package structural.adapter2

import java.util.logging.Level
import java.util.logging.Logger

class InnovaCar : Car {
    //concrete implementation of car
    override fun accelerate() {
        logger.log(Level.INFO, "is Accelerating using Diesel... ")
    }

    override fun insertFuel() {
        logger.log(
            Level.INFO, """is Filling Diesel...
 ---------------------------------------------------------------------------------------- """
        )
    }

    companion object {
        private val logger = Logger.getLogger(InnovaCar::class.java.name)
    }
}