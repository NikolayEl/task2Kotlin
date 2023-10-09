/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    print("Enter your age: ")
    val age: Int = readln().toInt()
    print("Enter your driving experience category B: ")
    val experienceB: Int = readln().toInt()
    print("Enter the selected car: ")
    val selectedCar: String = readln().toString()

    if (age >= 21 && experienceB >= 2) {
        if (age >= 26 && experienceB >= 6)
            println("Выбранный автомобиль $selectedCar доступен для вас")
        else if(selectedCar.contains("audi") || selectedCar.contains("BMW"))
            println("Выбранный автомобиль $selectedCar не подходит по стажу вождения или вашему возрасту")
        else
            println("Выбранный автомобиль $selectedCar доступен для вас")
    } else {
        println("Ваш возраст или стаж вождения не достаточен для получения авто в каршеринг")
        println("Приносим извенения за доставленные неудобства")
    }
}