package task06;

/**
 * Класс Dog представляет собаку с кличкой и породой.
 */
public class Dog {
    // Поля класса
    public String name;
    public String breed;

    // Конструктор
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Метод bark(), выводящий сообщение о лае собаки
    public void bark() {
        System.out.println(name + " (" + breed + ") громко лает: Гав-гав!");
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Собака: " + name + " | Порода: " + breed);
    }
}
