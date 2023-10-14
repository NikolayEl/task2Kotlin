class Round(val radius: Double, x: Int = 0, y: Int = 0, color:String = "white"): Figure(color) {
    fun getArea(): Double {
        return Math.PI * radius * radius
    }

    fun getLenght(): Double {
        return 2 * Math.PI * radius
    }
}