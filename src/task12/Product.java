package task12;

/**
 * Класс Product представляет товар на складе с названием, ценой и количеством.
 */
public class Product {
    // Поля класса
    public String name;
    public double price;
    public int quantity;

    // Конструктор с валидацией
    public Product(String name, double price, int quantity) {
        this.name = name;
        if (price < 0) {
            System.out.println("Предупреждение: цена товара не может быть отрицательной. Установлено 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (quantity < 0) {
            System.out.println("Предупреждение: количество товара не может быть отрицательным. Установлено 0.");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    // Метод вычисления общей стоимости товара на складе
    public double calculateTotalValue() {
        return price * quantity;
    }

    // Метод вывода информации о товаре
    public void displayInfo() {
        System.out.printf("Товар: %-15s | Цена: %8.2f руб. | Количество: %4d шт. | Общая стоимость: %10.2f руб.%n",
                name, price, quantity, calculateTotalValue());
    }
}
