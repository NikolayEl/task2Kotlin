/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/

fun main() {
    val triangle = Triangle(10.0, 7.0, 5.0)
    println("Area ${triangle.javaClass}: ${triangle.getArea()}")
    println("Perimetr ${triangle.javaClass}: ${triangle.getLenght()}")
}