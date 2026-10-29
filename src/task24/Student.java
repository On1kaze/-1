package task24;

/**
 * Класс Student представляет студента со средним баллом.
 */
public class Student {
    // Поля класса
    public String name;
    public double averageGrade;

    // Конструктор с валидацией среднего балла (шкала 0.0 - 100.0)
    public Student(String name, double averageGrade) {
        this.name = name;
        if (averageGrade < 0.0) {
            System.out.println("Предупреждение: средний балл не может быть меньше 0. Установлено 0.0.");
            this.averageGrade = 0.0;
        } else if (averageGrade > 100.0) {
            System.out.println("Предупреждение: средний балл не может быть больше 100. Установлено 100.0.");
            this.averageGrade = 100.0;
        } else {
            this.averageGrade = averageGrade;
        }
    }

    // Метод вывода информации о студенте
    public void displayInfo() {
        System.out.printf("Студент: %-18s | Средний балл: %5.2f%n", name, averageGrade);
    }
}
