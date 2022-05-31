package creational.singleton

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrinterDriverTest {

    @Test
    fun print() {

        val printerFirst = PrinterDriver.print()
        val printerSecond = PrinterDriver.print()

        assertEquals(printerFirst, PrinterDriver.print())



    }
}