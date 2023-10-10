import kotlin.math.roundToInt

/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {

    val employeeHome1 = Employee("Nikolay", 40)
    val employeeHome2 = Employee("Olga", 37)
    val employeeHome3 = Employee("Vlad", 11)
    val department1 = Department("MyHome", listOf(employeeHome1, employeeHome2, employeeHome3))

    val employeeNeighbours1 = Employee("Aleksey", 40)
    val employeeNeighbours2 = Employee("Nastia", 39)
    val employeeNeighbours3 = Employee("Alina", 13)
    val employeeNeighbours4 = Employee("Nikita", 11)
    val department2 = Department(
        "Neighbours",
        listOf(employeeNeighbours1, employeeNeighbours2, employeeNeighbours3, employeeNeighbours4)
    )

    val company = Company("Green Garden", mutableListOf(department1, department2))

    println("Count of employees in the company: ${company.name} = ${totalNumberOfEmployees(company)}")
    println("Average age of emloyees in the company: ${company.name} = ${averageAgeOfEmployees(company)}")

}

fun totalNumberOfEmployees(company: Company): Int {
    var count: Int = 0
    for (comp in company.departments) {
        count += comp.employees.size
    }
    return count
}

fun averageAgeOfEmployees(company: Company): Double {
    var sum: Int = 0
    var count: Int = 0
    for (comp in company.departments)
        for (employee in comp.employees) {
            sum += employee.age
            count++
        }
    return ((sum.toDouble() / count) * 10).roundToInt() / 10.0
}