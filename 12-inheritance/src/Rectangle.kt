class Rectangle(val width: Double, val height: Double, x: Int = 0, y: Int = 0, color:String = "white"):
    Figure(color) {
    fun getArea(): Double {
        return width * height
    }

    fun getPerimetr(): Double {
        return (width + height) * 2
    }

    fun examinationIsSquare(): Boolean {
        return width == height
    }
}
