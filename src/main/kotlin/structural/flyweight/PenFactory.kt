package structural.flyweight

object PenFactory {

    private val pensMap = HashMap<String, Pen?>()

    fun getThickPen(color: String): Pen? {
        val key = "$color-THICK"
        var pen = pensMap[key]
        if (pen != null) {
            return pen
        } else {
            pen = ThickPen()
            pen!!.setColor(color)
            pensMap[key] = pen
        }
        return pen
    }

    fun getThinPen(color: String): Pen? {
        val key = "$color-THIN"
        var pen = pensMap[key]
        if (pen != null) {
            return pen
        } else {
            pen = ThinPen()
            pen!!.setColor(color)
            pensMap[key] = pen
        }
        return pen
    }

    fun getMediumPen(color: String): Pen {
        val key = "$color-MEDIUM"
        var pen = pensMap[key]
        if (pen != null) {
            return pen
        } else {
            pen = MediumPen()
            pen.setColor(color)
            pensMap[key] = pen
        }
        return pen
    }
}