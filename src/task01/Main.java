package task01;

/**
 * Задание 1. Класс Student.
 * Создай класс Student с полями name, age и group.
 * Создай объект и выведи все его данные (проверено на двух объектах).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1: Класс Student ===");

        // Создание объектов с помощью оператора new
        Student student1 = new Student("Иван Иванов", 19, "ИС-21");
        Student student2 = new Student("Анна Смирнова", 20, "ПИ-22");

        // Обращение к полям напрямую через объекты
        System.out.println("Прямой доступ к полям объекта student1:");
        System.out.println("Имя: " + student1.name);
        System.out.println("Возраст: " + student1.age);
        System.out.println("Группа: " + student1.group);

        System.out.println("\nВызов метода через объект student1:");
        student1.displayInfo();

        System.out.println("\nВызов метода через объект student2:");
        student2.displayInfo();
    }
}
