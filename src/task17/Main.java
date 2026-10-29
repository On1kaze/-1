package task17;

/**
 * Задание 17. Класс Point.
 * Создай класс Point с координатами x и y.
 * Добавь метод вычисления расстояния от точки до начала координат.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 17: Класс Point ===");

        // Создание двух объектов точек
        Point point1 = new Point(3.0, 4.0); // Расстояние до (0,0) = 5.0 (египетский треугольник)
        Point point2 = new Point(6.0, 8.0); // Расстояние до (0,0) = 10.0

        // Прямой доступ к полям
        System.out.println("Координаты point1: x=" + point1.x + ", y=" + point1.y);
        System.out.println("Координаты point2: x=" + point2.x + ", y=" + point2.y);

        // Обращение к методу через объекты
        System.out.println("\nРасстояния до начала координат (0, 0):");
        System.out.println("point1.distanceToOrigin() = " + point1.distanceToOrigin());
        System.out.println("point2.distanceToOrigin() = " + point2.distanceToOrigin());

        // Расстояние между точками
        System.out.printf("Расстояние между point1 и point2: %.2f%n", point1.distanceTo(point2));

        System.out.println("\nИнформация об объектах:");
        point1.displayInfo();
        point2.displayInfo();
    }
}
