package task07;

/**
 * Задание 7. Класс Rectangle.
 * Создай класс Rectangle с полями width и height.
 * Добавь методы вычисления площади и периметра прямоугольника.
 * Проверено на двух объектах (+ проверка валидации).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 7: Класс Rectangle ===");

        // Создание двух объектов с корректными данными
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(10.5, 4.2);

        // Прямой доступ к полям
        System.out.println("rect1: ширина = " + rect1.width + ", высота = " + rect1.height);
        System.out.println("rect2: ширина = " + rect2.width + ", высота = " + rect2.height);

        // Вызов методов вычисления через объекты
        System.out.println("\nПлощадь rect1: " + rect1.calculateArea());
        System.out.println("Периметр rect1: " + rect1.calculatePerimeter());

        System.out.println("\nИнформация обо всех прямоугольниках:");
        rect1.displayInfo();
        rect2.displayInfo();

        // Проверка валидации данных (создание некорректного объекта)
        System.out.println("\nПроверка валидации некорректных данных:");
        Rectangle invalidRect = new Rectangle(-5.0, 0);
        invalidRect.displayInfo();
    }
}
