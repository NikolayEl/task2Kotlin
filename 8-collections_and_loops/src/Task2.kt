import kotlin.math.E

/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = Employee("Nikolay", 40)
    val user2 = Employee("Olga", 10)
    val user3 = Employee("Vlad", 11)
    val user4 = Employee("Nikita", 12)

    val listUser: List<Employee> = listOf(user1, user2, user3, user4)

    println("Emloyee with the lowest age: ${getMinAgeUser(listUser).name}")
}

fun getMinAgeUser(listUser: List<Employee>): Employee {
    var minAgeUser: Employee = listUser[0]
    for (user in listUser) {
        if (minAgeUser.age > user.age)
            minAgeUser = user
    }
    return minAgeUser
}