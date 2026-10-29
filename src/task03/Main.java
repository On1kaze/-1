package task03;

/**
 * Задание 3. Класс Book.
 * Создай класс Book с полями title, author и pages.
 * Выведи информацию о книге (проверено на двух объектах).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 3: Класс Book ===");

        // Создание двух объектов с помощью оператора new
        Book book1 = new Book("Война и мир", "Лев Толстой", 1225);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 672);

        // Обращение к полям через объекты
        System.out.println("Прямой доступ к полям book1: " + book1.title + " by " + book1.author + " (" + book1.pages + " стр.)");

        // Вызовы методов через объекты
        System.out.println("\nВывод через метод displayInfo():");
        book1.displayInfo();
        book2.displayInfo();
    }
}
