package task11;

/**
 * Класс BankAccount представляет банковский счёт с владельцем и балансом.
 */
public class BankAccount {
    // Поля класса
    public String owner;
    public double balance;

    // Конструктор с валидацией начального баланса
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance < 0) {
            System.out.println("Ошибка: начальный баланс не может быть отрицательным. Установлен 0.0.");
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Метод пополнения баланса с валидацией
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("[" + owner + "] Ошибка пополнения: сумма должна быть больше 0! Попытка: " + amount);
            return;
        }
        balance += amount;
        System.out.printf("[%s] Успешное пополнение на %.2f руб. Текущий баланс: %.2f руб.%n", owner, amount, balance);
    }

    // Метод снятия денег с баланса с проверкой остатка
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("[" + owner + "] Ошибка снятия: сумма должна быть больше 0! Попытка: " + amount);
            return false;
        }
        if (amount > balance) {
            System.out.printf("[%s] Отказ в снятии: недостаточно средств! Запрошено: %.2f руб., доступно: %.2f руб.%n",
                    owner, amount, balance);
            return false;
        }
        balance -= amount;
        System.out.printf("[%s] Успешное снятие %.2f руб. Текущий баланс: %.2f руб.%n", owner, amount, balance);
        return true;
    }

    // Метод вывода информации о счете
    public void displayInfo() {
        System.out.printf("Счет владельца: %s | Баланс: %.2f руб.%n", owner, balance);
    }
}
