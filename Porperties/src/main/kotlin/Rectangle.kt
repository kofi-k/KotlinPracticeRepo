class Rectangle(val width: Int, val height: Int) {
    val area get() = this.width * this.height
    val perimeter get() = 2 * (this.width + this.height)

}
