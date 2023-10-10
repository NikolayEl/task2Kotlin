/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

//Общие требования:
//•	Возраст не меньше 21 года.
//•	Водительский стаж категории «В» от двух лет.
//Дополнительные требования для доступа к автомобилям Audi, BMW:
//•	Возраст не меньше 26 лет.
//•	Водительский стаж категории «В» от шести лет.

fun main() {

    val user1 = Renter("Kirill", 23, 5)
    val car1 = Car("Audi RX", 3500)

    if (complianceChekRenter(user1, car1))
        println("Driver ${user1.name} can rent a ${car1.brand}, for ${car1.rentPrice}.")
    else
        println("Driver ${user1.name} not can rent a ${car1.brand}.")


}

fun complianceChekRenter(renter: Renter, car: Car): Boolean {
    if (renter.age >= 26 && renter.drivingExperience >= 6)
        return true
    else if (renter.age >= 21 && renter.drivingExperience >= 2 &&
        (!car.brand.contains("BMW") && !car.brand.contains("Audi"))
    )
        return true
    else
        return false
}

data class Renter(val name: String, val age: Int, val drivingExperience: Int)
data class Car(val brand: String, val rentPrice: Int)