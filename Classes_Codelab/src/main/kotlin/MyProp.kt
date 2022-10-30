open class MyProp (var height: Int) {
   var increaseHeight: Int
        get() = height * 2
        set(value) {
            height += value
       }
}
