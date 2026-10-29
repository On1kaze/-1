package task02;

/**
 * Задание 2. Класс Car.
 * Создай класс Car с полями brand, model и year.
 * Создай два объекта с разными характеристиками.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 2: Класс Car ===");

        // Создание двух объектов с помощью new
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("BMW", "M5", 2023);

        // Обращение к полям через объекты
        System.out.println("Характеристики car1 (через поля): " + car1.brand + ", " + car1.model + ", " + car1.year);
        System.out.println("Характеристики car2 (через поля): " + car2.brand + ", " + car2.model + ", " + car2.year);

        // Вызов метода через объекты
        System.out.println("\nВывод через метод displayInfo():");
        car1.displayInfo();
        car2.displayInfo();
    }
}
