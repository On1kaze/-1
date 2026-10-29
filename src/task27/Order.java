package task27;

/**
 * Класс Order представляет заказ покупателя.
 */
public class Order {
    // Поля класса
    public int orderNumber;
    public String productName;
    public double price;
    public int quantity;

    // Конструктор с валидацией
    public Order(int orderNumber, String productName, double price, int quantity) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        if (price < 0.0) {
            System.out.println("Предупреждение: цена не может быть отрицательной. Установлено 0.0.");
            this.price = 0.0;
        } else {
            this.price = price;
        }

        if (quantity < 0) {
            System.out.println("Предупреждение: количество не может быть отрицательным. Установлено 1.");
            this.quantity = 1;
        } else {
            this.quantity = quantity;
        }
    }

    // Метод расчёта итоговой стоимости
    public double calculateTotal() {
        return price * quantity;
    }

    // Метод изменения количества заказанного товара с проверкой корректности
    public void setQuantity(int newQuantity) {
        if (newQuantity <= 0) {
            System.out.printf("[Заказ #%d] Ошибка: количество товара должно быть больше нуля (передано: %d)!%n",
                    orderNumber, newQuantity);
            return;
        }
        System.out.printf("[Заказ #%d] Количество товара «%s» изменено: с %d на %d шт.%n",
                orderNumber, productName, this.quantity, newQuantity);
        this.quantity = newQuantity;
    }

    // Метод вывода данных заказа
    public void displayOrder() {
        System.out.printf("Заказ #%-4d | Товар: %-15s | Цена: %8.2f руб. | Кол-во: %2d шт. | Итого: %9.2f руб.%n",
                orderNumber, productName, price, quantity, calculateTotal());
    }
}
