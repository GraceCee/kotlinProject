package structural.adapter2

import java.util.logging.Level
import java.util.logging.Logger

object Main {
    private val logger = Logger.getLogger(Main::class.java.name)
    @JvmStatic
    fun main(args: Array<String>) {
        val innovaCar = InnovaCar()
        val toyCar: ToyCar = RemoteControlCar()

        //
        val carAdapter: ToyCar = CarAdapter(innovaCar)
        logger.log(Level.INFO, "Innova...")
        innovaCar.accelerate()
        innovaCar.insertFuel()
        logger.log(Level.INFO, "Remote Control Car...")
        toyCar.accelerates()

        //Toy Car behaving like Innova (real car)
        logger.log(Level.INFO, "Car Adapter")
        carAdapter.accelerates()
    }
}