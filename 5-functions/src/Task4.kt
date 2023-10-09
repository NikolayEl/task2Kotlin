/*
Написать функцию, которая проверяет email на корректность.
Корректным считается email если в нем присутствует символа @ и точка.
Проверить наличие символа в строке можно с помощью функции contains следующим образом: string.contains(‘@’),
где string – любая переменная типа String. Обратите внимание, что отдельные символы пишутся в одинарных кавычках,
тогда как строка пишется в двойных.

На вход email: String, на выходе Boolean
Например:
Если есть val text: String = “Forest”, тогда text.contains(‘e’) выдаст true, а !text.contains(‘e’)  выдаст false

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    print("Enter your e-mail:")
    val eMail: String = readln().toString()
    if(!getCheckingMail(eMail))
        println("Your e-mail is not correct! Please try again letter!")
}

fun getCheckingMail(eMail: String): Boolean
{
    return (eMail.contains('@') && eMail.contains('.'))
}
