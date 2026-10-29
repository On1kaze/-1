package task11;

/**
 * Задание 11. Класс BankAccount.
 * Создай класс банковского счёта с полями owner и balance.
 * Добавь методы deposit() для пополнения и withdraw() для снятия денег.
 * Предусмотрена проверка корректности данных (положительные суммы, проверка баланса).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 11: Класс BankAccount ===");

        // Создание двух объектов с помощью оператора new
        BankAccount account1 = new BankAccount("Алексей Морозов", 10000.0);
        BankAccount account2 = new BankAccount("Елена Соколова", 5000.0);

        // Прямой доступ к полям
        System.out.println("Владелец 1: " + account1.owner + ", баланс: " + account1.balance);
        System.out.println("Владелец 2: " + account2.owner + ", баланс: " + account2.balance);

        System.out.println("\n--- Операции со счетом 1 ---");
        account1.deposit(3500.0);
        account1.withdraw(2000.0);
        account1.withdraw(20000.0); // Попытка снять больше остатка (валидация)

        System.out.println("\n--- Операции со счетом 2 ---");
        account2.deposit(-500.0); // Попытка пополнить отрицательной суммой (валидация)
        account2.deposit(1500.0);
        account2.withdraw(6000.0);

        System.out.println("\n--- Итоговое состояние счетов ---");
        account1.displayInfo();
        account2.displayInfo();
    }
}
