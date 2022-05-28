package structural.flyweight


fun main(){
    val yellowThinPen1 = PenFactory.getThickPen("YELLOW") //created new pen
    yellowThinPen1!!.draw("Hello World !!")

    val yellowThinPen2 = PenFactory.getThickPen("YELLOW") //pen is shared
    yellowThinPen2!!.draw("Hello World !!")

    val blueThinPen = PenFactory.getThickPen("BLUE") //created new pen
    blueThinPen!!.draw("Hello World !!")

    println(yellowThinPen1.hashCode())
    println(yellowThinPen2.hashCode())
    println(blueThinPen.hashCode())


}