/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    print("Enter number: ")
    val number: Int = readln().toInt()

    println("Number $number - ${getTextRepresentationOfTheNumber(number)}")
}

fun getTextRepresentationOfTheNumber(number: Int): String {
    when (number) {
        1 -> return "One"
        2 -> return "Two"
        3 -> return "Three"
        4 -> return "Four"
        5 -> return "Five"
        else -> return "The number is gone beyond imagination"
    }
}