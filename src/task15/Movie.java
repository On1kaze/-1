package task15;

/**
 * Класс Movie представляет фильм с названием, жанром и продолжительностью в минутах.
 */
public class Movie {
    // Поля класса
    public String title;
    public String genre;
    public int duration; // в минутах

    // Конструктор с валидацией длительности
    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        if (duration <= 0) {
            System.out.println("Предупреждение: длительность фильма должна быть больше 0. Установлено 60 мин.");
            this.duration = 60;
        } else {
            this.duration = duration;
        }
    }

    // Метод, возвращающий информацию о фильме в одной строке
    public String getMovieInfo() {
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("Фильм: «%s» | Жанр: %s | Длительность: %d мин (%d ч %02d мин)",
                title, genre, duration, hours, minutes);
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.println(getMovieInfo());
    }
}
