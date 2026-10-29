package task17;

/**
 * Класс Point представляет точку на двумерной плоскости с координатами x и y.
 */
public class Point {
    // Поля класса
    public double x;
    public double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Метод вычисления расстояния от точки до начала координат (0, 0)
    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Дополнительный метод вычисления расстояния до другой точки
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Метод вывода координат
    public void displayInfo() {
        System.out.printf("Точка (%.2f, %.2f) | Расстояние до начала координат: %.2f%n",
                x, y, distanceToOrigin());
    }
}
