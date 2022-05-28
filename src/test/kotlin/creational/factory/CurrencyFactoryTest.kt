package creational.factory

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CurrencyFactoryTest {

    @Test
    fun currencyForGreece() {
        val greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
        println("Greece currency: $greeceCurrency")

        assertThat(greeceCurrency).isEqualTo("EUR")
    }
    @Test
    fun currencyForUS() {
        val usaCurrency = CurrencyFactory.currencyForCountry(Country.USA).code
        println("USA currency: $usaCurrency")

        assertThat(usaCurrency).isEqualTo("USD")
    }
}