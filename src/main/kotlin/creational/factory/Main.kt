package creational.factory

fun main(){
    val greeceCurrency = CurrencyFactory.currencyForCountry(Greece("")).code
    println("Greece currency: $greeceCurrency")

    val usaCurrency = CurrencyFactory.currencyForCountry(Country.USA).code
    println("USA currency: $usaCurrency")


    /**
     *
     * TESTING
     * assertThat(greeceCurrency).isEqualTo("EUR")
     * assertThat(usaCurrency).isEqualTo("USD")
     *
     *
     */


}