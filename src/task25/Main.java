package task25;

/**
 * Задание 25. Класс MobilePhone.
 * Создай класс телефона с полями brand, batteryLevel и isOn.
 * Добавь методы включения, выключения и расхода заряда батареи.
 * Проверено на двух объектах (+ валидация полного разряда).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 25: Класс MobilePhone ===");

        // Создание двух объектов с помощью new
        MobilePhone phone1 = new MobilePhone("Samsung Galaxy", 30);
        MobilePhone phone2 = new MobilePhone("Apple iPhone", 80);

        // Прямой доступ к полям
        System.out.println("phone1: бренд=" + phone1.brand + ", заряд=" + phone1.batteryLevel + "%, включен=" + phone1.isOn);
        System.out.println("phone2: бренд=" + phone2.brand + ", заряд=" + phone2.batteryLevel + "%, включен=" + phone2.isOn);

        System.out.println("\n--- Работа с телефоном 1 ---");
        phone1.usePhone(10); // Попытка использовать выключенный телефон
        phone1.turnOn();
        phone1.usePhone(15);
        phone1.usePhone(25); // Полная разрядка: батарея упадет до 0% и телефон выключится
        phone1.turnOn();     // Попытка включить разряженный телефон
        phone1.charge(50);
        phone1.turnOn();

        System.out.println("\n--- Работа с телефоном 2 ---");
        phone2.turnOn();
        phone2.usePhone(20);
        phone2.turnOff();

        System.out.println("\nИтоговые статусы:");
        phone1.displayStatus();
        phone2.displayStatus();
    }
}
