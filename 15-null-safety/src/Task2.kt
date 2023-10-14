/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/
fun employeeCity(employee: Employee): String{
    return "Человек по имени ${employee.name} работает в компании: ${employee.company?.name?: "Не работает"}," +
            " располагающаяся в городе: ${employee.company?.address?.city?: "Неизвестен"}, " +
            "по адресу: ${employee.company?.address?.address?:"Неизвестен"}"
}
fun main() {

    val adress1 = Address("December Events street, house 123, flat 12", "Irkutsk")
    val adress2 = Address("Yamskaya street, house 33, flat 41", "Irkutsk")
    val adress3 = Address("Subpharmacy street, house 1, flat 42", "Irkutsk")

    val companyShopOnline = Company("Wildberies", null)
    val companyPolice = Company("Police", adress3)
    val companyShop = Company("Amber", adress1)

    val employee1 = Employee("Nikolay", companyPolice)
    val employee2 = Employee("Olga", companyShopOnline)
    val employee3 = Employee("Akeksey", companyShop)
    val employee4 = Employee("Vladislav", null)

    println(employeeCity(employee4))
}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)