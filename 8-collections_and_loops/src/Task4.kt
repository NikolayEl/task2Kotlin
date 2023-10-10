import kotlin.math.roundToInt

/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val employee1 = Employee("Nikolay", 40)
    val employee2 = Employee("Olga", 37)
    val employee3 = Employee("Vlad", 11)

    val homeWork: Department = Department("Home Office", listOf(employee1, employee2, employee3))

    println("Average age of employees: ${getAverageAgeEmloyees(homeWork)}")
}

fun getAverageAgeEmloyees(homeWork: Department): Double {
    var sum: Int = 0
    for (emloyee in homeWork.employees)
        sum += emloyee.age
    return ((sum.toDouble() / homeWork.employees.size) * 10).roundToInt() / 10.0
}