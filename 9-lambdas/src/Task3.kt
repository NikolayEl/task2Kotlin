/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {

    val user1 = User("Nikolay", 40)
    val user2 = User("Olga", 37)
    val user3 = User("Vladislav", 11)

    val users: List<User> = listOf(user1, user2, user3)

    println("Users over 18: ${elementsCountCondition(users) { it -> it.age > 18 }}")
}

fun elementsCountCondition(users: List<User>, condition: (User) -> Boolean): Int {
    var count: Int = 0
    for (user in users)
        if (condition(user))
            count++
    return count
}