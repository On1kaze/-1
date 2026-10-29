package task07;

/**
 * Класс Rectangle представляет прямоугольник с шириной и высотой.
 */
public class Rectangle {
    // Поля класса
    public double width;
    public double height;

    // Конструктор с валидацией входных данных
    public Rectangle(double width, double height) {
        if (width <= 0) {
            System.out.println("Предупреждение: ширина должна быть больше 0. Установлено значение 1.0.");
            this.width = 1.0;
        } else {
            this.width = width;
        }

        if (height <= 0) {
            System.out.println("Предупреждение: высота должна быть больше 0. Установлено значение 1.0.");
            this.height = 1.0;
        } else {
            this.height = height;
        }
    }

    // Метод вычисления площади
    public double calculateArea() {
        return width * height;
    }

    // Метод вычисления периметра
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.printf("Прямоугольник: %.2f x %.2f | Площадь: %.2f | Периметр: %.2f%n",
                width, height, calculateArea(), calculatePerimeter());
    }
}
