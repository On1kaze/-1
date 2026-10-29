package task30;

/**
 * Задание 30. Мини-проект «Система управления университетом».
 * Создай классы Student, Teacher и Course в отдельных файлах .java.
 * Определи необходимые поля и методы для каждого класса.
 * Создай несколько объектов каждого типа и реализуй вывод информации о студентах,
 * преподавателях и курсах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("================================================================================");
        System.out.println("   МИНИ-ПРОЕКТ: «СИСТЕМА УПРАВЛЕНИЯ УНИВЕРСИТЕТОМ» (Задание 30)                ");
        System.out.println("================================================================================");

        // 1. Создание объектов студентов с помощью оператора new
        System.out.println("\n[1] Регистрация студентов:");
        Student s1 = new Student("STU-101", "Алексей Смирнов", "Программная инженерия", 2);
        Student s2 = new Student("STU-102", "Екатерина Иванова", "Прикладная математика", 3);
        Student s3 = new Student("STU-103", "Михаил Кузнецов", "Информационная безопасность", 1);
        Student s4 = new Student("STU-104", "София Морозова", "Программная инженерия", 2);

        // Прямой доступ к полям студента
        System.out.println("Демонстрация прямого обращения к полям объекта s1:");
        System.out.println("ID: " + s1.studentId + ", Имя: " + s1.name + ", Специальность: " + s1.major + ", Курс: " + s1.studyYear);

        System.out.println("\nВывод всех зарегистрированных студентов (через метод displayInfo()):");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();

        // 2. Создание объектов преподавателей с помощью new
        System.out.println("\n[2] Регистрация преподавателей:");
        Teacher t1 = new Teacher("TCH-01", "Проф. Соколов В. В.", "Кафедра компьютерных наук", "Профессор, д.т.н.");
        Teacher t2 = new Teacher("TCH-02", "Доц. Романова Е. Д.", "Кафедра высшей математики", "Доцент, к.ф.-м.н.");

        // Прямой доступ к полям преподавателя
        System.out.println("Демонстрация прямого обращения к полям объекта t1:");
        System.out.println("ID: " + t1.teacherId + ", ФИО: " + t1.name + ", Кафедра: " + t1.department);

        System.out.println("\nВывод преподавателей:");
        t1.displayInfo();
        t2.displayInfo();

        // 3. Создание объектов курсов с помощью new
        System.out.println("\n[3] Формирование учебных курсов:");
        Course courseJava = new Course("CS-201", "Объектно-ориентированное программирование на Java", 5, 3);
        Course courseMath = new Course("MATH-102", "Дискретная математика и алгоритмы", 4, 2);

        // Назначение преподавателей курсам
        courseJava.setTeacher(t1);
        courseMath.setTeacher(t2);

        // 4. Зачисление студентов на курсы с проверкой вместимости и валидацией
        System.out.println("\n[4] Зачисление студентов на курсы:");
        courseJava.enrollStudent(s1);
        courseJava.enrollStudent(s2);
        courseJava.enrollStudent(s4);
        courseJava.enrollStudent(s3); // Ошибка переполнения: вместимость 3 места

        System.out.println("\nЗачисление на курс дискретной математики:");
        courseMath.enrollStudent(s2);
        courseMath.enrollStudent(s2); // Повторное зачисление (дубликат)
        courseMath.enrollStudent(s3);

        // 5. Вывод сводной информации
        System.out.println("\n[5] Сводный каталог курсов:");
        courseJava.displayInfo();
        courseMath.displayInfo();

        System.out.println("\n[6] Подробные отчеты по курсам:");
        courseJava.displayFullCourseReport();
        courseMath.displayFullCourseReport();
    }
}
