package task19;

/**
 * Класс Clock представляет часы с часами, минутами и секундами.
 */
public class Clock {
    // Поля класса
    public int hours;
    public int minutes;
    public int seconds;

    // Конструктор с проверкой корректности времени
    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    // Метод установки времени с валидацией
    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            System.out.println("Предупреждение: некорректные часы (" + hours + "). Установлено 0.");
            this.hours = 0;
        } else {
            this.hours = hours;
        }

        if (minutes < 0 || minutes > 59) {
            System.out.println("Предупреждение: некорректные минуты (" + minutes + "). Установлено 0.");
            this.minutes = 0;
        } else {
            this.minutes = minutes;
        }

        if (seconds < 0 || seconds > 59) {
            System.out.println("Предупреждение: некорректные секунды (" + seconds + "). Установлено 0.");
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    // Метод отображения времени в формате HH:MM:SS
    public void displayTime() {
        System.out.printf("Время: %02d:%02d:%02d%n", hours, minutes, seconds);
    }

    // Метод такта (перевод времени на одну секунду вперед)
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours = (hours + 1) % 24;
            }
        }
    }
}
