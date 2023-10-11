/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val user1 = User("Nikolay", 40)
    val user2 = User("Olga", 37)
    val user3 = User("Vladislav", 11)

    val users = listOf(user1, user2, user3)

    val symbol: Char = 'P'
    if (containsElement(users) { it.name.contains(symbol) })
        println("The letter N is in this list users.")
    else
        println("The letter N is not in this list users.")


}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users)
        if (condition(user))
            return true
    return false
}