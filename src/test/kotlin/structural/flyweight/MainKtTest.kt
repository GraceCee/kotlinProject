package structural.flyweight

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun setColor() {
        val yellowThinPen1 = PenFactory.getThickPen("YELLOW") //created new pen
        assertThat(yellowThinPen1!!.setColor("YELLOW")).isEqualTo(yellowThinPen1.draw("Hello World !!"))

    }

}