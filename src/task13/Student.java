package task13;

/**
 * Класс Student представляет студента с именем и экзаменационной оценкой.
 */
public class Student {
    // Поля класса
    public String name;
    public double grade;

    // Конструктор с валидацией оценки (0..100 баллов)
    public Student(String name, double grade) {
        this.name = name;
        if (grade < 0) {
            System.out.println("Предупреждение: балл не может быть меньше 0. Установлено 0.");
            this.grade = 0;
        } else if (grade > 100) {
            System.out.println("Предупреждение: балл не может превышать 100. Установлено 100.");
            this.grade = 100;
        } else {
            this.grade = grade;
        }
    }

    // Метод определения сдачи экзамена (не ниже 50 баллов)
    public boolean hasPassed() {
        return grade >= 50.0;
    }

    // Метод вывода результата
    public void displayResult() {
        String status = hasPassed() ? "СДАЛ" : "НЕ СДАЛ";
        System.out.printf("Студент: %-15s | Оценка: %5.1f баллов | Результат: %s%n", name, grade, status);
    }
}
