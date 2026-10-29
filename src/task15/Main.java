package task15;

/**
 * Задание 15. Класс Movie.
 * Создай класс фильма с полями title, genre и duration.
 * Добавь метод, выводящий информацию о фильме в одной строке.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 15: Класс Movie ===");

        // Создание двух объектов
        Movie movie1 = new Movie("Интерстеллар", "Научная фантастика", 169);
        Movie movie2 = new Movie("Начало", "Фантастический боевик", 148);

        // Обращение к полям напрямую
        System.out.println("Поля movie1: " + movie1.title + " (" + movie1.genre + ", " + movie1.duration + " мин)");
        System.out.println("Поля movie2: " + movie2.title + " (" + movie2.genre + ", " + movie2.duration + " мин)");

        // Вызов метода вывода информации в одной строке
        System.out.println("\nВывод через getMovieInfo():");
        System.out.println(movie1.getMovieInfo());
        System.out.println(movie2.getMovieInfo());
    }
}
