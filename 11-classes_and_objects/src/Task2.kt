/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val circle1 = Round(10.0)

    println("Area of a circle: ${circle1.getArea()}")
    println("Lenght of a circle: ${circle1.getLenght()}")


}

class Round(val radius: Double) {
    fun getArea(): Double {
        return Math.PI * radius * radius
    }

    fun getLenght(): Double {
        return 2 * Math.PI * radius
    }
}