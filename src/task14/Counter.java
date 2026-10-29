package task14;

/**
 * Класс Counter представляет счётчик с целочисленным значением.
 */
public class Counter {
    // Поле класса
    public int count;

    // Конструктор по умолчанию
    public Counter() {
        this.count = 0;
    }

    // Конструктор с начальным значением
    public Counter(int initialCount) {
        this.count = initialCount;
    }

    // Метод увеличения значения на 1
    public void increment() {
        count++;
    }

    // Метод уменьшения значения на 1
    public void decrement() {
        count--;
    }

    // Метод сброса значения в 0
    public void reset() {
        count = 0;
    }

    // Метод получения текущего значения
    public int getCount() {
        return count;
    }

    // Метод вывода информации
    public void displayInfo(String label) {
        System.out.println("Счётчик [" + label + "] = " + count);
    }
}
