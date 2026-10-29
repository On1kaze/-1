package task18;

/**
 * Задание 18. Класс ShoppingCart.
 * Создай класс корзины покупок с полями productName, price и quantity.
 * Добавь метод вычисления суммы покупки и метод изменения количества товара.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 18: Класс ShoppingCart ===");

        // Создание двух объектов корзины
        ShoppingCart item1 = new ShoppingCart("Кофе зерновой 1кг", 1450.0, 2);
        ShoppingCart item2 = new ShoppingCart("Чай листовой 200г", 380.0, 5);

        // Прямой доступ к полям
        System.out.println("Товар 1 (поля): " + item1.productName + ", цена=" + item1.price + ", кол-во=" + item1.quantity);
        System.out.println("Товар 2 (поля): " + item2.productName + ", цена=" + item2.price + ", кол-во=" + item2.quantity);

        // Расчет стоимости через метод calculateTotal()
        System.out.println("\nСуммы покупок до изменения:");
        System.out.printf("Сумма по товару 1: %.2f руб.%n", item1.calculateTotal());
        System.out.printf("Сумма по товару 2: %.2f руб.%n", item2.calculateTotal());

        // Изменение количества через метод с валидацией
        System.out.println("\n--- Изменение количества товаров ---");
        item1.setQuantity(4);
        item2.setQuantity(-3); // Попытка установить некорректное значение
        item2.setQuantity(3);

        System.out.println("\nИтоговые данные корзины:");
        item1.displayInfo();
        item2.displayInfo();

        double totalOrder = item1.calculateTotal() + item2.calculateTotal();
        System.out.printf("Общая стоимость корзины: %.2f руб.%n", totalOrder);
    }
}
