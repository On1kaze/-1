package task21;

/**
 * Задание 21. Класс Computer.
 * Создай класс Computer с полями brand, processor, ram и price.
 * Создай три объекта и реализуй метод вывода характеристик каждого компьютера.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 21: Класс Computer ===");

        // Создание трех объектов с помощью new
        Computer pc1 = new Computer("Dell", "Intel Core i7-13700K", 32, 145000.0);
        Computer pc2 = new Computer("HP", "AMD Ryzen 5 7600X", 16, 85000.0);
        Computer pc3 = new Computer("Apple Mac", "Apple M3 Pro", 36, 230000.0);

        // Прямой доступ к полям
        System.out.println("Прямой доступ к полям pc1: бренд=" + pc1.brand + ", ЦП=" + pc1.processor + ", ОЗУ=" + pc1.ram + "GB");

        // Вывод характеристик через метод displaySpecs()
        System.out.println("\nХарактеристики всех компьютеров:");
        pc1.displaySpecs();
        pc2.displaySpecs();
        pc3.displaySpecs();
    }
}
