package task01;

/**
 * Класс Student представляет студента с именем, возрастом и учебной группой.
 */
public class Student {
    // Поля класса
    public String name;
    public int age;
    public String group;

    // Конструктор класса
    public Student(String name, int age, String group) {
        if (age < 0) {
            System.out.println("Предупреждение: возраст не может быть отрицательным. Установлено значение 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
        this.name = name;
        this.group = group;
    }

    // Метод для вывода информации о студенте
    public void displayInfo() {
        System.out.println("Студент: " + name + " | Возраст: " + age + " | Группа: " + group);
    }
}
