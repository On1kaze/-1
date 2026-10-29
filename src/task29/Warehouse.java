package task29;

/**
 * Класс Warehouse представляет склад товаров с ограничением вместимости.
 */
public class Warehouse {
    // Поля класса
    public String productName;
    public int quantity;
    public int capacity;

    // Конструктор с валидацией
    public Warehouse(String productName, int quantity, int capacity) {
        this.productName = productName;
        if (capacity <= 0) {
            System.out.println("Предупреждение: вместимость склада должна быть положительной. Установлено 100.");
            this.capacity = 100;
        } else {
            this.capacity = capacity;
        }

        if (quantity < 0) {
            System.out.println("Предупреждение: начальное количество не может быть отрицательным. Установлено 0.");
            this.quantity = 0;
        } else if (quantity > this.capacity) {
            System.out.println("Предупреждение: начальное количество превышает вместимость! Установлено значение вместимости: " + this.capacity);
            this.quantity = this.capacity;
        } else {
            this.quantity = quantity;
        }
    }

    // Метод добавления товаров (запрещено превышение вместимости)
    public boolean addProduct(int amount) {
        if (amount <= 0) {
            System.out.println("[" + productName + "] Ошибка: количество для добавления должно быть больше нуля.");
            return false;
        }
        if (quantity + amount > capacity) {
            int overflow = (quantity + amount) - capacity;
            System.out.printf("[%s] Отказ в добавлении: превышена вместимость склада! " +
                    "Запрошено +%d шт., доступно места: %d шт. (излишек: %d шт.)%n",
                    productName, amount, (capacity - quantity), overflow);
            return false;
        }
        quantity += amount;
        System.out.printf("[%s] Успешно добавлено %d шт. Текущий остаток: %d/%d шт.%n",
                productName, amount, quantity, capacity);
        return true;
    }

    // Метод удаления товаров (запрещено списание свыше остатка)
    public boolean removeProduct(int amount) {
        if (amount <= 0) {
            System.out.println("[" + productName + "] Ошибка: количество для списания должно быть больше нуля.");
            return false;
        }
        if (amount > quantity) {
            System.out.printf("[%s] Отказ в списании: недостаточно товара на складе! " +
                    "Запрошено списание %d шт., в наличии только %d шт.%n",
                    productName, amount, quantity);
            return false;
        }
        quantity -= amount;
        System.out.printf("[%s] Успешно списано %d шт. Текущий остаток: %d/%d шт.%n",
                productName, amount, quantity, capacity);
        return true;
    }

    // Метод вывода статуса склада
    public void displayStatus() {
        System.out.printf("Склад [%-15s] | В наличии: %4d шт. | Вместимость: %4d шт. | Заполненность: %5.1f%%%n",
                productName, quantity, capacity, ((double) quantity / capacity * 100.0));
    }
}
