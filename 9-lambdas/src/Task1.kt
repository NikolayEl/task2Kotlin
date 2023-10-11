/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс Userуже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = User("Nikolay", 40)
    val user2 = User("Olga", 37)
    val user3 = User("Vladislav", 11)

    val users = mutableListOf(user1, user2, user3)

    println(convertUsersToString(users) { it -> "Name: ${it.name}, age: ${it.age}" })
}

fun convertUsersToString(users: List<User>, conversion: (User) -> String): List<String> {
    val result = mutableListOf<String>()
    for (user in users) {
        result.add(conversion(user))
    }
    return result
}