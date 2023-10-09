/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    print("Enter first number: ")
    val a: Int = readln().toInt();
    print("Enter second number: ")
    val b: Int = readln().toInt()

    val maxNumber: Int = getMaxNumber(a, b)

    println("The maximun number is: $maxNumber.")
}

fun getMaxNumber(firstNumber: Int, secondNumber: Int): Int{
    val result: Int = if (firstNumber > secondNumber)
        firstNumber
    else
        secondNumber
    return result
}