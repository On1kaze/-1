package task03;

/**
 * Класс Book представляет книгу с названием, автором и количеством страниц.
 */
public class Book {
    // Поля класса
    public String title;
    public String author;
    public int pages;

    // Конструктор
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        if (pages <= 0) {
            System.out.println("Предупреждение: количество страниц должно быть положительным. Установлено 1.");
            this.pages = 1;
        } else {
            this.pages = pages;
        }
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Книга: \"" + title + "\" | Автор: " + author + " | Страниц: " + pages);
    }
}
