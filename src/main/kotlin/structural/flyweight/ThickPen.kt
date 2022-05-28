package structural.flyweight

class ThickPen : Pen {
    val brushSize = BrushSize.THICK //intrinsic state - shareable
    private var color: String? = null //extrinsic state - supplied by client
    override fun setColor(color: String?) {
        this.color = color
    }

    override fun draw(content: String?) {
        println("Drawing THICK content in color: $color")
    }
}

