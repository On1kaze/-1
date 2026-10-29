package task05;

/**
 * Задание 5. Класс Cat.
 * Создай класс Cat с полями name и age.
 * Добавь метод meow(), который выводит сообщение о том, что кошка мяукает.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 5: Класс Cat ===");

        // Создание двух объектов
        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Мурка", 2);

        // Обращение к полям
        System.out.println("Кошка 1: " + cat1.name + ", возраст: " + cat1.age);
        System.out.println("Кошка 2: " + cat2.name + ", возраст: " + cat2.age);

        // Вызовы методов через объекты
        System.out.println("\nВызовы метода meow():");
        cat1.meow();
        cat2.meow();

        System.out.println("\nИнформация об объектах:");
        cat1.displayInfo();
        cat2.displayInfo();
    }
}
