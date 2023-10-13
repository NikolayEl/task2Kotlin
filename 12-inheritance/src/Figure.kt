open class Figure(val color: String) {
    var x: Int = 0
    var y: Int = 0
    fun moveLeft(step: Int) {
        x -= step
    }

    fun moveRight(step: Int) {
        x += step
    }

    fun moveDown(step: Int){
        y += step
    }
    fun moveUp(step: Int){
        y -= step
    }
}