package creational.factory


import creational.factory.cars.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.logging.Logger

class FactoryTestRunner {
    var carFactory: CarFactory = CarFactory()
    private val logger = Logger.getLogger(FactoryTestRunner::class.java.name)



    @Test
    fun returnsMitsubishi() {
        // checks if object is same kind
        var car1 = "OUTLANDER"
        assertTrue(carFactory.makeCar(car1) is Mitsubishi)
        logger.info(car1 + " was the Input "+" Mitsubishi is the Car.")
    }

    @Test
    fun returnsNissan() {
        // checks if object is same kind
        var car1 = "GT-R"
        assertTrue(carFactory.makeCar(car1) is Nissan)
        logger.info(car1 + " was the Input "+" Nissan is the Car.")

    }

    @Test
    fun returnsToyota() {
        // checks if object is same kind
        var car1 = "FORTUNER"
        assertTrue(carFactory.makeCar(car1) is Toyota)
        logger.info(car1 + " was the Input "+" Toyota is the Car.")

    }

    @Test
    fun returnsOtherCar() {
        // checks if object is same kind
        var car1 = "TRAILBLAZER"
        assertTrue(carFactory.makeCar(car1) is OtherCar)
        logger.info(car1 + " was the Input "+" it is some other Car.")

    }

    @Test
    fun returnsDifferentColors() {
        // checks if different Color are produced as intended
        var car1 = carFactory.makeCar("RED")
        var car2 = carFactory.makeCar("BLACK")

        assertFalse(car1 == car2)
        logger.info("Two different Car Colors are returned.")

    }


}