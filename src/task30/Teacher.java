package task30;

/**
 * Класс Teacher представляет преподавателя университета.
 */
public class Teacher {
    // Поля класса
    public String teacherId;
    public String name;
    public String department;
    public String academicTitle;

    // Конструктор
    public Teacher(String teacherId, String name, String department, String academicTitle) {
        this.teacherId = teacherId;
        this.name = name;
        this.department = department;
        this.academicTitle = academicTitle;
    }

    // Метод вывода информации о преподавателе
    public void displayInfo() {
        System.out.printf("Преподаватель [%s] %-20s | Кафедра: %-25s | Звание: %s%n",
                teacherId, name, department, academicTitle);
    }

    @Override
    public String toString() {
        return name + " (" + academicTitle + ", " + department + ")";
    }
}
