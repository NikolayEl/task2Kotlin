/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    print("Enter your age: ")
    val age: Int = readln().toInt()
    print("Enter your driving experience category B: ")
    val drivingExpirience: Int = readln().toInt()
    println(getAnswerCarSharing(age, drivingExpirience))
}

fun getAnswerCarSharing(age: Int, drivingExpirience: Int): String
{
    return (
            if(age > 26 && drivingExpirience > 6)
                "All cars are available to you, including: Audi, BMW."
            else if(age > 21 && drivingExpirience > 2)
                "All cars are available to you, except: Audi, BMW."
            else
                "You are not of sufficient age or driving experience to " +
                        "operate a car."
            )
}