package task10;

/**
 * Класс Laptop представляет ноутбук с маркой, объемом оперативной памяти и ценой.
 */
public class Laptop {
    // Поля класса
    public String brand;
    public int ram;
    public double price;

    // Конструктор с валидацией
    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        if (ram <= 0) {
            System.out.println("Предупреждение: объем RAM должен быть положительным. Установлено 4 ГБ.");
            this.ram = 4;
        } else {
            this.ram = ram;
        }

        if (price < 0) {
            System.out.println("Предупреждение: цена не может быть отрицательной. Установлено 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    // Метод сравнения стоимости с другим ноутбуком
    public void comparePrice(Laptop other) {
        if (this.price > other.price) {
            System.out.printf("Ноутбук %s (%.2f руб.) дороже, чем %s (%.2f руб.) на %.2f руб.%n",
                    this.brand, this.price, other.brand, other.price, (this.price - other.price));
        } else if (this.price < other.price) {
            System.out.printf("Ноутбук %s (%.2f руб.) дешевле, чем %s (%.2f руб.) на %.2f руб.%n",
                    this.brand, this.price, other.brand, other.price, (other.price - this.price));
        } else {
            System.out.printf("Ноутбуки %s и %s имеют одинаковую стоимость: %.2f руб.%n",
                    this.brand, other.brand, this.price);
        }
    }

    // Метод вывода характеристик
    public void displayInfo() {
        System.out.printf("Ноутбук: %s | RAM: %d ГБ | Цена: %.2f руб.%n", brand, ram, price);
    }
}
