package task22;

/**
 * Задание 22. Класс BankAccount с несколькими объектами.
 * Создай два банковских счёта. Реализуй пополнение и снятие денег для каждого счёта.
 * Убедись, что изменение одного объекта не влияет на другой.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 22: Класс BankAccount с проверкой изоляции объектов ===");

        // Создание двух независимых счетов с помощью оператора new
        BankAccount accountA = new BankAccount("Алиса", 50000.0);
        BankAccount accountB = new BankAccount("Борис", 20000.0);

        System.out.println("--- Исходное состояние счетов ---");
        accountA.displayInfo();
        accountB.displayInfo();

        // Фиксация баланса Бориса до операций над Алисой
        double borisBalanceBefore = accountB.balance;

        System.out.println("\n--- Выполнение операций ТОЛЬКО со счетом Алисы ---");
        accountA.deposit(15000.0);
        accountA.withdraw(25000.0);

        System.out.println("\n--- Проверка изоляции состояния объектов ---");
        System.out.println("Баланс Алисы (accountA.balance): " + accountA.balance + " руб.");
        System.out.println("Баланс Бориса (accountB.balance): " + accountB.balance + " руб.");

        if (accountB.balance == borisBalanceBefore) {
            System.out.println("УСПЕХ: Баланс счета Бориса остался неизменным (объекты изолированы в куче памяти)!");
        } else {
            System.out.println("ОШИБКА: Баланс счета Бориса непреднамеренно изменился!");
        }

        System.out.println("\n--- Теперь выполняем операции со счетом Бориса ---");
        accountB.deposit(10000.0);
        accountB.withdraw(5000.0);

        System.out.println("\n--- Итоговые балансы ---");
        accountA.displayInfo();
        accountB.displayInfo();
    }
}
