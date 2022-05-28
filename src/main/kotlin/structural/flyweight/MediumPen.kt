package structural.flyweight

/**
 *
 * Class MediumPen implements Pen
 */

class MediumPen : Pen {
    val brushSize = BrushSize.MEDIUM
    private var color: String? = null
    override fun setColor(color: String?) {
        this.color = color
    }

    override fun draw(content: String?) {
        println("Drawing MEDIUM content in color: $color")
    }
}

