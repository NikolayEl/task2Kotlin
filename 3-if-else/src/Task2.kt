/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    print("Enter the first integer number: ")
    val number1: Int = readln().toInt()
    print("Enter the second integer number: ")
    val number2: Int = readln().toInt()

    if(number1 > number2)
        println("The first number: $number1 is max")
    if(number2 > number1)
        println("The second number: $number2 is max")
    else
        println("Number first: $number1 = number second: $number2")
}