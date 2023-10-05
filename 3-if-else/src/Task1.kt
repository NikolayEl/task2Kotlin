/* Вывести на экран большее из двух целых чисел. */

fun main() {
    print("Enter first integer number: ")
    val number1: Int = readln().toInt()
    print("Enter first integer number: ")
    val number2: Int = readln().toInt()

    if (number1 > number2)
        println("max = $number1")
    else if (number2 > number1)
        println("max = $number2")
    else
        println("no max, becase number1: $number1 = number2: $number2")

}
