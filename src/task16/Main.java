package task16;

/**
 * Задание 16. Класс Temperature.
 * Создай класс с полем температуры в градусах Цельсия.
 * Добавь методы преобразования в Фаренгейты и Кельвины.
 * Проверено на двух объектах (+ проверка граничного случая).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 16: Класс Temperature ===");

        // Создание двух объектов с помощью new
        Temperature temp1 = new Temperature(25.0);  // Комнатная температура
        Temperature temp2 = new Temperature(100.0); // Точка кипения воды

        // Прямой доступ к полю
        System.out.println("Значение поля temp1.celsius: " + temp1.celsius + " °C");
        System.out.println("Значение поля temp2.celsius: " + temp2.celsius + " °C");

        // Обращение к методам преобразования через объекты
        System.out.printf("temp1 в Фаренгейтах: %.2f °F, в Кельвинах: %.2f K%n",
                temp1.toFahrenheit(), temp1.toKelvin());
        System.out.printf("temp2 в Фаренгейтах: %.2f °F, в Кельвинах: %.2f K%n",
                temp2.toFahrenheit(), temp2.toKelvin());

        System.out.println("\nСводка по температурам:");
        temp1.displayInfo();
        temp2.displayInfo();

        // Проверка валидации (ниже абсолютного нуля)
        System.out.println("\nПроверка валидации (ниже абсолютного нуля):");
        Temperature invalidTemp = new Temperature(-300.0);
        invalidTemp.displayInfo();
    }
}
