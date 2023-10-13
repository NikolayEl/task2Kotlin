abstract class Figure(val color: String) {
    protected var x: Int = 0
    protected var y: Int = 0
    fun moveLeft(step: Int) {
        x -= step
    }

    fun moveRight(step: Int) {
        x += step
    }

    fun moveDown(step: Int) {
        y += step
    }

    fun moveUp(step: Int) {
        y -= step
    }

    abstract fun getArea(): Double
    abstract fun getLenght(): Double
}