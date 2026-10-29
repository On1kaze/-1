package task08;

/**
 * Класс Circle представляет круг с радиусом.
 */
public class Circle {
    // Поле класса
    public double radius;

    // Конструктор с валидацией
    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Предупреждение: радиус должен быть положительным. Установлено 1.0.");
            this.radius = 1.0;
        } else {
            this.radius = radius;
        }
    }

    // Метод вычисления площади круга (S = π * r^2)
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод вычисления длины окружности (C = 2 * π * r)
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.printf("Круг [радиус: %.2f] -> Площадь: %.2f, Длина окружности: %.2f%n",
                radius, calculateArea(), calculateCircumference());
    }
}
