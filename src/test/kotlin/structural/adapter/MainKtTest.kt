package structural.adapter

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun main() {
        val celsiusTemperature = CelsiusTemperature(0.0)
        val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

        celsiusTemperature.temperature = 36.6
        println("${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")
        assertThat(fahrenheitTemperature.temperature).isEqualTo(97.88000000000001)

        fahrenheitTemperature.temperature = 100.00
        println("${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")
        assertThat(celsiusTemperature.temperature).isEqualTo(37.77777777777778)


    }
}