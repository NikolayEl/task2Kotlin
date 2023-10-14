import kotlin.math.roundToInt

class Triangle(
    val side_a: Double, val side_b: Double, val side_c: Double,
    color: String = "white"
) : Figure(color) {
    override fun getLenght(): Double {
        return side_a + side_b + side_c
    }

    override fun getArea(): Double {
        val halfPerimetr = getLenght() / 2
        return ((Math.sqrt(
            halfPerimetr * (halfPerimetr - side_a) * (halfPerimetr - side_b)
                    * (halfPerimetr - side_c) ))* 10).roundToInt() / 10.0

    }
}