/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    print("Enter the name of the selected car: ")
    val selectedCar: String = readln().toString()
    print("Enter your age: ")
    val age: Int = readln().toInt()
    print("Enter your driving experience in the category B:")
    val drivengExperience: Int = readln().toInt()
    if (getCheckData(selectedCar, age, drivengExperience))
        println("$selectedCar - this car is available to you.")
    else
        println("$selectedCar - this car is not available to you.")

}

fun getCheckData(selectedCar: String, age: Int, drivingExperiens: Int): Boolean {
    if (selectedCar.contains("BMW") || selectedCar.contains("Audi"))
        return age >= 26 && drivingExperiens >= 6
    else if (age >= 21)
        return drivingExperiens >= 2
    else
        return false

}