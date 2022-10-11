open class Shape {
    open val vertexCount: Int = 0 //property open for overriding
    val borderColor: String get() = "black"
    open fun drawShape() {} //method open for overriding
    open fun fill() {}
}

class Square : Shape() {

    //override val vertexCount: Int = 4 //property overridden and initialized OR
    override val vertexCount: Int //property overridden and initialized with get method
        get() = super.vertexCount

    val fillColor: String get() = super.borderColor //calling a superclass implementation
    override fun drawShape() { //open method overridden
        super.drawShape()
    }

    override fun fill() {
        super.fill()
    }
}

class RectangleShape(override var vertexCount: Int) :
    Shape() //overriding property in constructor with a var property, can be set to any number later

class Star(override val vertexCount: Int = 5) :
    Shape() //overriding property in constructor with a val property, always has 5 vertices

class DrawRectangle : Shape() {
    override fun drawShape() {
        super.drawShape()
        val colorFiller = ColorFiller()//instance of inner class ColorFiller
        colorFiller.drawAndFill() //instance method invocation
    }

    //inner class
    inner class ColorFiller {
        fun fill() {
            println("filling with color ${super@DrawRectangle.borderColor}")//use Shape's implementation of borderColor's get()
        }
        fun drawAndFill() {
            super@DrawRectangle.drawShape() //call on DrawRectangle's drawShape
            fill()
            println("Drawn a filled rectangle with color ${super@DrawRectangle.borderColor}")
        }
    }
}