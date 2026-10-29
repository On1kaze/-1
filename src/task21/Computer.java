package task21;

/**
 * Класс Computer представляет компьютер с брендом, процессором, объёмом ОЗУ и ценой.
 */
public class Computer {
    // Поля класса
    public String brand;
    public String processor;
    public int ram;
    public double price;

    // Конструктор с валидацией
    public Computer(String brand, String processor, int ram, double price) {
        this.brand = brand;
        this.processor = processor;
        if (ram <= 0) {
            System.out.println("Предупреждение: RAM должен быть больше 0. Установлено 8 ГБ.");
            this.ram = 8;
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

    // Метод вывода характеристик компьютера
    public void displaySpecs() {
        System.out.printf("Компьютер %-10s | Процессор: %-18s | ОЗУ: %2d ГБ | Цена: %9.2f руб.%n",
                brand, processor, ram, price);
    }
}
