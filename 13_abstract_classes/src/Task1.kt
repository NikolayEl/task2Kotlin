/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
 */

fun main() {
    val rectangle = Rectangle(10.0, 20.0)
    val circle = Round(30.0)

    val figures = listOf<Figure>(rectangle, circle)

    for (figure in figures) {
        println("Area figure ${figure.javaClass}: ${figure.getArea()}")
        println("Lenght figure ${figure.javaClass}: ${figure.getLenght()}")
    }
}