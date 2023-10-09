/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    print("Enter first number: ")
    val a: Int = readln().toInt()
    print("Enter second number: ")
    val b: Int = readln().toInt()

    println(getMaxNumberResult(a, b))
}

fun getMaxNumberResult(firstNumber: Int, secondNumber: Int): String {
    return (if (firstNumber > secondNumber)
        "The first number is max"
    else if (secondNumber > firstNumber)
        "The second number is max"
    else
        "numbers are equal")
}