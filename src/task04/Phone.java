package task04;

/**
 * Класс Phone представляет мобильный телефон с маркой, моделью и ценой.
 */
public class Phone {
    // Поля класса
    public String brand;
    public String model;
    public double price;

    // Конструктор
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        if (price < 0) {
            System.out.println("Предупреждение: цена не может быть отрицательной. Установлено 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    // Метод для вывода характеристик
    public void displayInfo() {
        System.out.printf("Телефон: %s %s | Цена: %.2f руб.%n", brand, model, price);
    }
}
