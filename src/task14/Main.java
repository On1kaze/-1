package task14;

/**
 * Задание 14. Класс Counter.
 * Создай класс Counter с целочисленным полем count.
 * Добавь методы увеличения, уменьшения и сброса значения счётчика.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 14: Класс Counter ===");

        // Создание двух объектов счетчиков
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);

        // Прямой доступ к полю count
        System.out.println("Начальные значения через поля: counter1.count=" + counter1.count + ", counter2.count=" + counter2.count);

        // Изменение первого счетчика
        System.out.println("\n--- Работа со счетчиком 1 ---");
        counter1.increment();
        counter1.increment();
        counter1.increment();
        counter1.decrement();
        System.out.println("После трех increment и одного decrement: " + counter1.getCount());

        // Изменение второго счетчика
        System.out.println("\n--- Работа со счетчиком 2 ---");
        counter2.decrement();
        counter2.decrement();
        System.out.println("После двух decrement: " + counter2.getCount());

        // Сброс второго счетчика
        System.out.println("Сброс счетчика 2...");
        counter2.reset();
        System.out.println("После reset(): " + counter2.getCount());

        System.out.println("\nИтоговые значения через displayInfo():");
        counter1.displayInfo("Счетчик 1");
        counter2.displayInfo("Счетчик 2");
    }
}
