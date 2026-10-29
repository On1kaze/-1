package task13;

/**
 * Задание 13. Класс Student с оценками.
 * Добавь в класс Student поля name и grade.
 * Реализуй метод определения, сдал ли студент экзамен при оценке не ниже 50 баллов.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 13: Класс Student с оценками ===");

        // Создание двух объектов: один сдал, второй не сдал
        Student student1 = new Student("Дмитрий Волков", 78.5);
        Student student2 = new Student("Ольга Сидорова", 42.0);

        // Прямой доступ к полям
        System.out.println("Студент 1 (поля): " + student1.name + ", оценка: " + student1.grade);
        System.out.println("Студент 2 (поля): " + student2.name + ", оценка: " + student2.grade);

        // Обращение к методам через объекты
        System.out.println("\nПроверка сдачи через hasPassed():");
        System.out.println(student1.name + " сдал экзамен? " + student1.hasPassed());
        System.out.println(student2.name + " сдал экзамен? " + student2.hasPassed());

        System.out.println("\nИтоговые результаты:");
        student1.displayResult();
        student2.displayResult();
    }
}
