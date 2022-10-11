open class Rectangle {
    val borderColor: String get() = "reckless red"
    open fun draw() {
        println("Drawing a rectangle")
    }
}

class FillRectangle() : Rectangle() {
    override fun draw() {
        val filler = Filler()//instance of inner class Filler
        filler.drawAndFill()
    }

    //inner class
    inner class Filler {
        private fun fill() = println("Filling")//single expression method in inner class

        fun drawAndFill() {
            super@FillRectangle.draw()//implementation of  FillRectangle's draw method
            fill()
            println("Drawn a rectangle with ${super@FillRectangle.borderColor} fill")//uses Rectangle's  implementation of borderColor's get()
        }
    }
}