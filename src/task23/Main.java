package task23;

/**
 * Задание 23. Класс Library.
 * Создай класс LibraryBook с полями title, author и isAvailable.
 * Добавь методы выдачи и возврата книги.
 * Нельзя выдать книгу, если она уже выдана.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 23: Класс LibraryBook ===");

        // Создание двух объектов книг с помощью new
        LibraryBook book1 = new LibraryBook("Мастер и Маргарита", "Михаил Булгаков");
        LibraryBook book2 = new LibraryBook("1984", "Джордж Оруэлл");

        // Прямой доступ к полям
        System.out.println("Поля book1: " + book1.title + " by " + book1.author + ", доступна: " + book1.isAvailable);
        System.out.println("Поля book2: " + book2.title + " by " + book2.author + ", доступна: " + book2.isAvailable);

        System.out.println("\n--- Проверка выдачи и возврата для книги 1 ---");
        book1.borrowBook(); // Успешно
        book1.borrowBook(); // Повторная попытка (должна быть отклонена)
        book1.returnBook(); // Успешный возврат
        book1.returnBook(); // Повторный возврат (предупреждение)

        System.out.println("\n--- Выдача книги 2 ---");
        book2.borrowBook();

        System.out.println("\nИтоговое состояние книг в библиотеке:");
        book1.displayInfo();
        book2.displayInfo();
    }
}
