package task18;

/**
 * Класс ShoppingCart представляет позицию корзины покупок
 * с наименованием товара, ценой и количеством.
 */
public class ShoppingCart {
    // Поля класса
    public String productName;
    public double price;
    public int quantity;

    // Конструктор с валидацией
    public ShoppingCart(String productName, double price, int quantity) {
        this.productName = productName;
        if (price < 0) {
            System.out.println("Предупреждение: цена не может быть отрицательной. Установлено 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (quantity < 0) {
            System.out.println("Предупреждение: количество не может быть отрицательным. Установлено 0.");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    // Метод вычисления суммы покупки
    public double calculateTotal() {
        return price * quantity;
    }

    // Метод изменения количества товара с проверкой корректности
    public void setQuantity(int newQuantity) {
        if (newQuantity < 0) {
            System.out.println("[" + productName + "] Ошибка: количество не может быть отрицательным (" + newQuantity + ")! Значение не изменено.");
            return;
        }
        System.out.printf("[%s] Количество изменено: было %d шт., стало %d шт.%n",
                productName, this.quantity, newQuantity);
        this.quantity = newQuantity;
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.printf("Товар: %-15s | Цена: %8.2f руб. | Кол-во: %3d шт. | Итого: %9.2f руб.%n",
                productName, price, quantity, calculateTotal());
    }
}
