package creational.factory.cars

abstract class Cars {
    var name: String? = null
    var price = 0.0
    var color: String? = null


    fun purchasedCar() {
        println(name +" "+ color + " was purchased  for - " + "\u20b1" +""+price.toString())
    }
}