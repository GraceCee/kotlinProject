package creational


import creational.factory.CurrencyFactory
import creational.factory.Greece
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FactoryTest {

    @Test

    fun currencyForCountry(){
//        val greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
//        assertThat(greeceCurrency).isEqualTo("EUR")

        var greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
        assertTrue {greeceCurrency.equals("EUR")  }

    }



}
