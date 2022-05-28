package creational.singleton

object PrinterDriver {
    init {
        println("Initializing with object: $this")
    }

    fun print() = println("Printing with object: $this")
}