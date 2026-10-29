package task30;

/**
 * Класс Student представляет студента университета.
 */
public class Student {
    // Поля класса
    public String studentId;
    public String name;
    public String major;
    public int studyYear;

    // Конструктор с валидацией
    public Student(String studentId, String name, String major, int studyYear) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        if (studyYear < 1 || studyYear > 6) {
            System.out.println("Предупреждение: курс студента должен быть от 1 до 6. Установлен 1 курс.");
            this.studyYear = 1;
        } else {
            this.studyYear = studyYear;
        }
    }

    // Метод вывода информации о студенте
    public void displayInfo() {
        System.out.printf("Студент [%s] %-18s | Направление: %-25s | Курс: %d%n",
                studentId, name, major, studyYear);
    }

    @Override
    public String toString() {
        return name + " (" + studentId + ", " + studyYear + " курс)";
    }
}
