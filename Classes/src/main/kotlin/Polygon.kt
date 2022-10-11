abstract class Polygon { //implicitly inherits from superclass Any
    abstract fun drawShape()
}

class Rectangle : Polygon() {  //implicitly final by default, can not be inherited
    override fun drawShape() {
        TODO("Not yet implemented")
    }
}

open class Polygon2 { //class is open for inheritance
    open fun drawShape() {}
}

abstract class Rectangle2 : Polygon2() {
    abstract override fun drawShape()
}

open class Base1(p: Int)//class open for inheritance, with primary constructor
class Derived1(p: Int) : Base1(p) //inherits from superclass Base