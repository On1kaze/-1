package task09;

/**
 * Задание 9. Класс Employee.
 * Создай класс Employee с полями name, position и salary.
 * Создай объект и выведи информацию о сотруднике (проверено на двух объектах).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 9: Класс Employee ===");

        // Создание двух объектов
        Employee emp1 = new Employee("Сергей Петров", "Главный инженер", 150000.0);
        Employee emp2 = new Employee("Мария Кузнецова", "Менеджер проектов", 125000.0);

        // Обращение к полям через объекты
        System.out.println("Прямой доступ к полям emp1: " + emp1.name + " (" + emp1.position + "), оклад: " + emp1.salary);
        System.out.println("Прямой доступ к полям emp2: " + emp2.name + " (" + emp2.position + "), оклад: " + emp2.salary);

        // Вызов метода вывода через объекты
        System.out.println("\nВывод через метод displayInfo():");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
