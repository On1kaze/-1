package task24;

/**
 * Задание 24. Класс StudentGroup.
 * Создай класс Student с полями name и averageGrade.
 * Создай пять объектов студентов и найди студента с наибольшим средним баллом.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 24: Класс StudentGroup ===");

        // Создание пяти объектов студентов с помощью new
        Student student1 = new Student("Илья Смирнов", 88.4);
        Student student2 = new Student("Дарья Попова", 95.6);
        Student student3 = new Student("Артем Васильев", 76.2);
        Student student4 = new Student("Виктория Козлова", 98.1);
        Student student5 = new Student("Максим Новиков", 82.0);

        // Массив объектов студентов
        Student[] group = {student1, student2, student3, student4, student5};

        System.out.println("Список студентов группы:");
        for (Student s : group) {
            // Обращение к полям и вызов метода
            s.displayInfo();
        }

        // Поиск студента с наибольшим средним баллом через обращение к полям
        Student topStudent = group[0];
        for (int i = 1; i < group.length; i++) {
            if (group[i].averageGrade > topStudent.averageGrade) {
                topStudent = group[i];
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.printf("Студент с наивысшим баллом: %s (%.2f баллов)%n",
                topStudent.name, topStudent.averageGrade);
        System.out.println("-------------------------------------------");
    }
}
