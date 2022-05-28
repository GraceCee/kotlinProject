package creational.singleton

import assertk.assertThat
import assertk.assertions.isSameAs
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PrinterDriverTest {

    @Test
    fun print() {

        val printerFirst = PrinterDriver.print()
        val printerSecond = PrinterDriver.print()

        assertThat(printerFirst).isSameAs(PrinterDriver.print())
        assertThat(printerSecond).isSameAs(PrinterDriver.print())


    }
}