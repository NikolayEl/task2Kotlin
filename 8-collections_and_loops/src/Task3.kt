import javax.swing.text.StyledEditorKit.BoldAction

/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val car1 = Car("Citroen", "C4 2018", (2000).toDouble())
    val car2 = Car("Volkswagen", "Polo 2016", (1800).toDouble())
    val car3 = Car("Kia", "Rio 2017", (1900).toDouble())
    val car4 = Car("Toyota", "Aqua 2019", (2000).toDouble())
    val car5 = Car("BMW", "X6 2019", (3500).toDouble())
    val car6 = Car("Audi", "Q7 2018", (3200).toDouble())

    val allCars: List<Car> = listOf(car1, car2, car3, car4, car5, car6)

    val user = Employee("Olga", 25, 6)

    println("List cars available to you:")
    if (dataCheking(allCars, user).size > 0) {
        for (car in dataCheking(allCars, user))
            println("Car: ${car.brand}, Model: ${car.model}, cost: ${car.cost}")
    } else
        println("No cars available.")
}

fun dataCheking(allCars: List<Car>, user: Employee): List<Car> {
    val availableCar = mutableListOf<Car>();
    val veryExperiencedDriver: Boolean = (user.age >= 26 && user.drivenExperience >= 6)
    val experiencedDriver: Boolean = (user.age >= 21 && user.drivenExperience >= 2)

    for (car in allCars) {
        if (veryExperiencedDriver || (experiencedDriver && !car.brand.contains("BMW")
                    && !car.brand.contains("Audi")))
            availableCar.add(car)
    }
    return availableCar
}