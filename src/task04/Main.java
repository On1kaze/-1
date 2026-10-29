package task04;

/**
 * Задание 4. Класс Phone.
 * Создай класс Phone с полями brand, model и price.
 * Создай три объекта и выведи их характеристики.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 4: Класс Phone ===");

        // Создание трех объектов с помощью new
        Phone phone1 = new Phone("Apple", "iPhone 15 Pro", 119990.0);
        Phone phone2 = new Phone("Samsung", "Galaxy S24", 89990.0);
        Phone phone3 = new Phone("Xiaomi", "14 Ultra", 79990.0);

        // Прямой доступ к полям
        System.out.println("Прямой доступ к данным phone1: " + phone1.brand + " " + phone1.model + ", цена: " + phone1.price);

        // Вызов метода вывода для всех трех объектов
        System.out.println("\nХарактеристики всех телефонов через метод displayInfo():");
        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();
    }
}
