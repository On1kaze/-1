package task23;

/**
 * Класс LibraryBook представляет книгу в библиотеке.
 */
public class LibraryBook {
    // Поля класса
    public String title;
    public String author;
    public boolean isAvailable;

    // Конструктор (по умолчанию книга доступна)
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Перегруженный конструктор с явным указанием доступности
    public LibraryBook(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Метод выдачи книги
    public boolean borrowBook() {
        if (!isAvailable) {
            System.out.printf("Отказ: книга «%s» (%s) уже выдана читателю!%n", title, author);
            return false;
        }
        isAvailable = false;
        System.out.printf("Книга «%s» (%s) успешно выдана читателю.%n", title, author);
        return true;
    }

    // Метод возврата книги
    public boolean returnBook() {
        if (isAvailable) {
            System.out.printf("Предупреждение: книга «%s» уже находится в библиотеке!%n", title);
            return false;
        }
        isAvailable = true;
        System.out.printf("Книга «%s» (%s) успешно возвращена в библиотеку.%n", title, author);
        return true;
    }

    // Метод вывода информации о книге
    public void displayInfo() {
        String status = isAvailable ? "ДОСТУПНА" : "ВЫДАНА";
        System.out.printf("Книга: «%-25s» | Автор: %-15s | Статус: %s%n", title, author, status);
    }
}
