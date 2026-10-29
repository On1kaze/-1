package task30;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс Course представляет учебный курс в университете.
 */
public class Course {
    // Поля класса
    public String courseCode;
    public String title;
    public int credits;
    public Teacher teacher;
    public int maxCapacity;
    public List<Student> enrolledStudents;

    // Конструктор
    public Course(String courseCode, String title, int credits, int maxCapacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = Math.max(1, credits);
        this.maxCapacity = Math.max(1, maxCapacity);
        this.enrolledStudents = new ArrayList<>();
    }

    // Метод назначения преподавателя
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        System.out.printf("[%s] Назначен преподаватель: %s%n", title, teacher.name);
    }

    // Метод зачисления студента с проверкой лимита и дубликатов
    public boolean enrollStudent(Student student) {
        if (student == null) {
            System.out.println("Ошибка: передан пустой объект студента.");
            return false;
        }

        if (enrolledStudents.contains(student)) {
            System.out.printf("[%s] Студент %s уже зачислен на этот курс!%n", title, student.name);
            return false;
        }

        if (enrolledStudents.size() >= maxCapacity) {
            System.out.printf("[%s] Отказ: группа курса переполнена (максимум %d студентов)! Студент %s не зачислен.%n",
                    title, maxCapacity, student.name);
            return false;
        }

        enrolledStudents.add(student);
        System.out.printf("[%s] Студент %s успешно зачислен. (Занято мест: %d/%d)%n",
                title, student.name, enrolledStudents.size(), maxCapacity);
        return true;
    }

    // Краткий вывод информации о курсе
    public void displayInfo() {
        String teacherName = (teacher != null) ? teacher.name : "Не назначен";
        System.out.printf("Курс [%s] %-30s | Кредиты: %d | Преподаватель: %-18s | Студентов: %d/%d%n",
                courseCode, title, credits, teacherName, enrolledStudents.size(), maxCapacity);
    }

    // Полный подробный отчет по курсу
    public void displayFullCourseReport() {
        System.out.println("================================================================================");
        System.out.printf("ОТЧЕТ ПО КУРСУ: [%s] %s%n", courseCode, title);
        System.out.printf("Трудоемкость: %d зачетных единиц (кредитов)%n", credits);
        System.out.println("Преподаватель: " + (teacher != null ? teacher : "Не назначен"));
        System.out.printf("Зачислено студентов: %d из %d доступных мест%n", enrolledStudents.size(), maxCapacity);
        if (enrolledStudents.isEmpty()) {
            System.out.println("  (Студентов пока нет)");
        } else {
            System.out.println("Список зачисленных студентов:");
            for (int i = 0; i < enrolledStudents.size(); i++) {
                System.out.printf("  %d. %s%n", (i + 1), enrolledStudents.get(i));
            }
        }
        System.out.println("================================================================================");
    }
}
