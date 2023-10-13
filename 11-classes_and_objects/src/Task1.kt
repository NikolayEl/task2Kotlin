/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle1 = Rectangle(10.0, 10.0)

    println("Area rectangle: ${rectangle1.getArea()}")
    println("Perimetr rectangle: ${rectangle1.getPerimetr()}")
    println("Is this rectangle a square?: ${rectangle1.examinationIsSquare()}")
}

class Rectangle(
    val width: Double,
    val height: Double
) {
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