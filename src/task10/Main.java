package task10;

/**
 * Задание 10. Класс Laptop.
 * Создай класс Laptop с полями brand, ram и price.
 * Создай два объекта и сравни их стоимость.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 10: Класс Laptop ===");

        // Создание двух объектов с помощью new
        Laptop laptop1 = new Laptop("ASUS ROG", 32, 165000.0);
        Laptop laptop2 = new Laptop("Lenovo ThinkPad", 16, 95000.0);

        // Прямой доступ к полям
        System.out.println("Поля laptop1: " + laptop1.brand + ", RAM=" + laptop1.ram + "GB, Цена=" + laptop1.price);
        System.out.println("Поля laptop2: " + laptop2.brand + ", RAM=" + laptop2.ram + "GB, Цена=" + laptop2.price);

        // Вывод информации
        System.out.println("\nХарактеристики моделей:");
        laptop1.displayInfo();
        laptop2.displayInfo();

        // Сравнение стоимости через метод
        System.out.println("\nСравнение стоимости:");
        laptop1.comparePrice(laptop2);
    }
}
