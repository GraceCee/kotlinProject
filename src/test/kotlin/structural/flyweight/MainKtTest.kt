package structural.flyweight
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun penTestBrushSize(){
        val penTestThick = PenFactory.getThickPen("")
        assertEquals(penTestThick!!.setColor("Green"),penTestThick!!.draw("Hello"))

        val penTestThin = PenFactory.getThinPen("")
        assertEquals(penTestThin!!.setColor("Black"),penTestThin!!.draw("Hello"))

        val penTestMedium = PenFactory.getMediumPen("")
        assertEquals(penTestMedium!!.setColor("Blue"),penTestMedium!!.draw("Hello"))
    }

    @Test
    fun penHashCodes(){
        //THICK PEN
        val penTestThick = PenFactory.getThickPen("")
        val penHashCode =  penTestThick.hashCode()
        assertEquals(penTestThick!!.setColor("Green"),penTestThick!!.draw("Hello"))
        assertEquals(penTestThick!!.hashCode(), penHashCode)

        //THIN PEN

        val penTestThin = PenFactory.getThinPen("")
        val penHashCode2 =  penTestThin.hashCode()
        assertEquals(penTestThin!!.setColor("Black"),penTestThin!!.draw("Hello"))
        assertEquals(penTestThin!!.hashCode(), penHashCode2)

        //MEDIUM PEN

        val penTestMedium = PenFactory.getMediumPen("")
        val penHashCode3 =  penTestMedium.hashCode()
        assertEquals(penTestMedium!!.setColor("Blue"),penTestMedium!!.draw("Hello"))
        assertEquals(penTestMedium!!.hashCode(), penHashCode3)


    }


}