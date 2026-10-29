package task09;

/**
 * Класс Employee представляет сотрудника с именем, должностью и окладом.
 */
public class Employee {
    // Поля класса
    public String name;
    public String position;
    public double salary;

    // Конструктор
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        if (salary < 0) {
            System.out.println("Предупреждение: зарплата не может быть отрицательной. Установлено 0.0.");
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }

    // Метод вывода информации о сотруднике
    public void displayInfo() {
        System.out.printf("Сотрудник: %s | Должность: %s | Зарплата: %.2f руб.%n",
                name, position, salary);
    }
}
