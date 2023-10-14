abstract class Figure(val color: String) : Movable {
    protected var x: Int = 0
    protected var y: Int = 0
    override fun moveLeft(step: Int) {
        x -= step
    }

    override fun moveRight(step: Int) {
        x += step
    }

    override fun moveDown(step: Int) {
        y += step
    }

    override fun moveUp(step: Int) {
        y -= step
    }

    abstract fun getArea(): Double
    abstract fun getLenght(): Double
}