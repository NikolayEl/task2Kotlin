
/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val employee1 = SomeEmployee("Nikolay", 45000)
    val employee2 = SomeEmployee("Olga", 25000)
    val employee3 = SomeEmployee("Aleksey", 45000)

    val employees = listOf<SomeEmployee>(employee1, employee2, employee3)

    try {
        findEmployeeBySalary(employees) { it.salary < 24000 }?.callToClient("Oleg")
    } catch (e: Exception){
        println(e.message)
    }
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, condition: (SomeEmployee) -> Boolean): SomeEmployee {
    var someEmployeeSalary: MutableList<SomeEmployee>? = mutableListOf<SomeEmployee>()
    for (employee in employees)
        if (condition(employee))
            return employee
    throw Exception("Employees according to the given conditions were not found")
}