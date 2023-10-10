/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = Employee("Nikolay", 40)
    val user2 = Employee("Olga", 25)
    val user3 = Employee("Vladislav", 11)

    val listUser: List<Employee> = listOf(user1, user2, user3)

    println("Average of age = ${getAverageAge(listUser)}")

}

fun getAverageAge(listUser: List<Employee>): Double
{
    var sum: Int = 0
    var count: Int = 0
    for( i in listUser){
        sum += i.age
        count++
    }
    return sum.toDouble() / count
}