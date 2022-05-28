package creational.factory

object CurrencyFactory {

    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Greece -> Currency("EUR")
            is Spain -> Currency("EUR")
            is Country.USA -> Currency("USD")
            is Canada -> Currency("CAD")
        }  //try to add a new country Poland, it won't even compile without adding new branch to 'when'
}