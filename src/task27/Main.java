package task27;

/**
 * Задание 27. Класс Order.
 * Создай класс заказа с полями orderNumber, productName, price и quantity.
 * Добавь метод расчёта итоговой стоимости и метод изменения количества заказанного товара.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 27: Класс Order ===");

        // Создание двух заказов с помощью new
        Order order1 = new Order(101, "Наушники Sony", 18500.0, 1);
        Order order2 = new Order(102, "Мышь Logitech", 4200.0, 3);

        // Прямой доступ к полям
        System.out.println("Заказ 1 (поля): #" + order1.orderNumber + ", товар: " + order1.productName +
                ", цена: " + order1.price + ", кол-во: " + order1.quantity);
        System.out.println("Заказ 2 (поля): #" + order2.orderNumber + ", товар: " + order2.productName +
                ", цена: " + order2.price + ", кол-во: " + order2.quantity);

        System.out.println("\nСтоимость заказов до изменения:");
        System.out.printf("Сумма заказа #%d: %.2f руб.%n", order1.orderNumber, order1.calculateTotal());
        System.out.printf("Сумма заказа #%d: %.2f руб.%n", order2.orderNumber, order2.calculateTotal());

        System.out.println("\n--- Изменение количества ---");
        order1.setQuantity(2);  // Увеличиваем до 2 шт
        order2.setQuantity(-5); // Некорректное значение (валидация)
        order2.setQuantity(5);  // Корректно

        System.out.println("\nИтоговые данные заказов:");
        order1.displayOrder();
        order2.displayOrder();
    }
}
