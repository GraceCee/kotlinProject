package structural.flyweight

class ThinPen : Pen {
    val brushSize = BrushSize.THIN
    private var color: String? = null
    override fun setColor(color: String?) {
        this.color = color
    }

    override fun draw(content: String?) {
        println("Drawing THIN content in color :$color")
    }
}