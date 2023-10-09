/*
Вывести для чисел от 1 до 5 их текстовое представление: 1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то вывести: «ошибка»
*/

fun main() {
    print("Enter the integer number (1-5): ")
    val value: Int = readln().toInt()

    when (value) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
    }
}