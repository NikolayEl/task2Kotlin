/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val employee1 = SomeEmployee("Nikolay", 45000)
    val employee2 = SomeEmployee("Olga", 25000)
    val employee3 = SomeEmployee("Aleksey", 45000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3)
    findEmployeeBySalary(employees){it.salary < 24000}?.callToClient("Oleg")
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, condition: (SomeEmployee) -> Boolean): SomeEmployee? {
    var someEmployeeSalary: MutableList<SomeEmployee>? = mutableListOf<SomeEmployee>()
    for (employee in employees)
        if (condition(employee))
            return employee
    return null
}