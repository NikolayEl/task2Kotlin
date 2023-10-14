class Animal(val name: String) : Movable {
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

    fun printAnimal() {
        for (i in 1..y) println("")
        for (i in 1..x) print(" ")
        println("${name}")
    }
}