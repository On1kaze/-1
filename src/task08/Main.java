package task08;

/**
 * Задание 8. Класс Circle.
 * Создай класс Circle с полем radius.
 * Добавь метод вычисления площади круга.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 8: Класс Circle ===");

        // Создание двух объектов с помощью new
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(7.5);

        // Прямой доступ к полю через объект
        System.out.println("Радиус первого круга (поле): " + circle1.radius);
        System.out.println("Радиус второго круга (поле): " + circle2.radius);

        // Вызов метода вычисления площади через объекты
        System.out.printf("Площадь круга 1 (метод): %.2f%n", circle1.calculateArea());
        System.out.printf("Площадь круга 2 (метод): %.2f%n", circle2.calculateArea());

        System.out.println("\nПолная информация об объектах:");
        circle1.displayInfo();
        circle2.displayInfo();

        // Проверка валидации
        System.out.println("\nПроверка валидации с некорректным радиусом:");
        Circle invalid = new Circle(-3.0);
        invalid.displayInfo();
    }
}
