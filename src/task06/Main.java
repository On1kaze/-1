package task06;

/**
 * Задание 6. Класс Dog.
 * Создай класс Dog с полями name и breed.
 * Добавь метод bark(), выводящий сообщение о лае собаки.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 6: Класс Dog ===");

        // Создание двух объектов с помощью оператора new
        Dog dog1 = new Dog("Шарик", "Овчарка");
        Dog dog2 = new Dog("Бобик", "Хаски");

        // Обращение к полям напрямую
        System.out.println("Первая собака: кличка " + dog1.name + ", порода " + dog1.breed);
        System.out.println("Вторая собака: кличка " + dog2.name + ", порода " + dog2.breed);

        // Вызов метода bark() через объекты
        System.out.println("\nВызовы метода bark():");
        dog1.bark();
        dog2.bark();

        System.out.println("\nИнформация об объектах:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
