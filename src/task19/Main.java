package task19;

/**
 * Задание 19. Класс Clock.
 * Создай класс часов с полями hours, minutes и seconds.
 * Добавь метод отображения времени в формате HH:MM:SS.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 19: Класс Clock ===");

        // Создание двух объектов часов
        Clock clock1 = new Clock(8, 30, 45);
        Clock clock2 = new Clock(23, 59, 58);

        // Прямой доступ к полям
        System.out.println("Поля clock1: hours=" + clock1.hours + ", minutes=" + clock1.minutes + ", seconds=" + clock1.seconds);
        System.out.println("Поля clock2: hours=" + clock2.hours + ", minutes=" + clock2.minutes + ", seconds=" + clock2.seconds);

        // Вызов метода отображения времени
        System.out.print("Часы 1: ");
        clock1.displayTime();

        System.out.print("Часы 2 (до полуночи): ");
        clock2.displayTime();

        // Проверка перехода через полночь с помощью tick()
        System.out.println("\nЧасы 2 тикают 3 секунды:");
        clock2.tick();
        clock2.displayTime();
        clock2.tick();
        clock2.displayTime();
        clock2.tick();
        clock2.displayTime();

        // Проверка валидации некорректного времени
        System.out.println("\nПроверка валидации некорректного времени (25:70:99):");
        Clock invalidClock = new Clock(25, 70, 99);
        invalidClock.displayTime();
    }
}
