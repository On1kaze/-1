package task16;

/**
 * Класс Temperature представляет температуру в градусах Цельсия
 * с методами преобразования в шкалы Фаренгейта и Кельвина.
 */
public class Temperature {
    // Поле класса
    public double celsius;

    // Конструктор с валидацией абсолютного нуля (-273.15 °C)
    public Temperature(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Предупреждение: температура ниже абсолютного нуля (-273.15 °C)! Установлено -273.15 °C.");
            this.celsius = -273.15;
        } else {
            this.celsius = celsius;
        }
    }

    // Метод преобразования в градусы Фаренгейта (F = C * 9/5 + 32)
    public double toFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Метод преобразования в Кельвины (K = C + 273.15)
    public double toKelvin() {
        return celsius + 273.15;
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.printf("Температура: %.2f °C | %.2f °F | %.2f K%n",
                celsius, toFahrenheit(), toKelvin());
    }
}
