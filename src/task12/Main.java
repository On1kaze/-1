package task12;

/**
 * Задание 12. Класс Product.
 * Создай класс товара с полями name, price и quantity.
 * Добавь метод для вычисления общей стоимости товара на складе.
 * Проверено на двух объектах (+ валидация).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 12: Класс Product ===");

        // Создание двух объектов с помощью new
        Product product1 = new Product("Клавиатура", 3500.0, 15);
        Product product2 = new Product("Монитор 27\"", 22000.0, 8);

        // Прямой доступ к полям
        System.out.println("Поле name товара 1: " + product1.name);
        System.out.println("Поле price товара 1: " + product1.price);
        System.out.println("Поле quantity товара 1: " + product1.quantity);

        // Вызов методов вычисления стоимости через объекты
        System.out.printf("Общая стоимость %s: %.2f руб.%n", product1.name, product1.calculateTotalValue());
        System.out.printf("Общая стоимость %s: %.2f руб.%n", product2.name, product2.calculateTotalValue());

        System.out.println("\nСводка по складам:");
        product1.displayInfo();
        product2.displayInfo();
    }
}
