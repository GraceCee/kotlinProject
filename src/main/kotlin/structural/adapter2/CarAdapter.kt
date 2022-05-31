package structural.adapter2

class CarAdapter(var car: Car) : ToyCar {
    override fun accelerates() {
        car.accelerate()
    }
}