package task05;

/**
 * Класс Cat представляет кошку с именем и возрастом.
 */
public class Cat {
    // Поля класса
    public String name;
    public int age;

    // Конструктор
    public Cat(String name, int age) {
        this.name = name;
        if (age < 0) {
            System.out.println("Предупреждение: возраст кошки не может быть отрицательным. Установлено 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Метод meow(), выводящий сообщение о мяуканьи кошки
    public void meow() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.println("Кошка: " + name + " | Возраст: " + age + " лет/года");
    }
}
