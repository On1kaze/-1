package task29;

/**
 * Задание 29. Класс Warehouse.
 * Создай класс склада с полями productName, quantity и capacity.
 * Добавь методы добавления и удаления товаров.
 * Запрещай добавление сверх вместимости и удаление количества, превышающего остаток.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 29: Класс Warehouse ===");

        // Создание двух объектов складов с помощью new
        Warehouse warehouseA = new Warehouse("Смартфоны", 80, 100);
        Warehouse warehouseB = new Warehouse("Ноутбуки", 15, 50);

        // Прямой доступ к полям
        System.out.println("Склад A (поля): товар=" + warehouseA.productName + ", кол-во=" + warehouseA.quantity + ", вместимость=" + warehouseA.capacity);
        System.out.println("Склад B (поля): товар=" + warehouseB.productName + ", кол-во=" + warehouseB.quantity + ", вместимость=" + warehouseB.capacity);

        System.out.println("\n--- Операции со складом A (Смартфоны) ---");
        warehouseA.displayStatus();
        warehouseA.addProduct(15); // Станет 95/100
        warehouseA.addProduct(10); // Попытка добавить 10 (95 + 10 = 105 > 100) -> запрет!
        warehouseA.removeProduct(30); // Станет 65/100

        System.out.println("\n--- Операции со складом B (Ноутбуки) ---");
        warehouseB.displayStatus();
        warehouseB.removeProduct(20); // Попытка списать 20 при наличии 15 -> запрет!
        warehouseB.addProduct(25);  // Станет 40/50
        warehouseB.removeProduct(10); // Станет 30/50

        System.out.println("\n--- Итоговые статусы складов ---");
        warehouseA.displayStatus();
        warehouseB.displayStatus();
    }
}
