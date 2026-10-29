package task26;

/**
 * Задание 26. Класс Car с пробегом.
 * Создай класс автомобиля с полями brand, mileage и fuel.
 * Добавь метод поездки, который увеличивает пробег и уменьшает запас топлива.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 26: Класс Car с пробегом ===");

        // Создание двух объектов автомобилей
        Car car1 = new Car("Volkswagen Golf", 45000.0, 30.0, 7.5);
        Car car2 = new Car("Lada Vesta", 12000.0, 10.0, 8.0);

        // Прямой доступ к полям
        System.out.println("car1 (поля): " + car1.brand + ", пробег: " + car1.mileage + " км, топливо: " + car1.fuel + " л");
        System.out.println("car2 (поля): " + car2.brand + ", пробег: " + car2.mileage + " км, топливо: " + car2.fuel + " л");

        System.out.println("\n--- Поездка первого автомобиля (успешная) ---");
        car1.drive(200.0); // 200 км при расходе 7.5 л = 15 л

        System.out.println("\n--- Поездка второго автомобиля (с нехваткой топлива) ---");
        car2.drive(200.0); // 200 км при расходе 8.0 л требует 16 л, а есть только 10 л!
        car2.refuel(25.0); // Заправка
        car2.drive(50.0);

        System.out.println("\nИтоговые данные автомобилей:");
        car1.displayStatus();
        car2.displayStatus();
    }
}
