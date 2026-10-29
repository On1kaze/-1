package task02;

/**
 * Класс Car представляет автомобиль с маркой, моделью и годом выпуска.
 */
public class Car {
    // Поля класса
    public String brand;
    public String model;
    public int year;

    // Конструктор
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        if (year < 1886) { // 1886 год — первый автомобиль Карла Бенца
            System.out.println("Предупреждение: некорректный год выпуска (" + year + "). Установлен 1886 год.");
            this.year = 1886;
        } else {
            this.year = year;
        }
    }

    // Метод для вывода информации об автомобиле
    public void displayInfo() {
        System.out.println("Автомобиль: " + brand + " " + model + " (" + year + " г.в.)");
    }
}
