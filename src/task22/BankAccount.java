package task22;

/**
 * Класс BankAccount представляет отдельный банковский счёт.
 */
public class BankAccount {
    // Поля класса
    public String owner;
    public double balance;

    // Конструктор
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        if (initialBalance < 0) {
            System.out.println("Ошибка: начальный баланс не может быть отрицательным! Установлен 0.0.");
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    // Метод пополнения
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.printf("[%s] Ошибка: сумма пополнения должна быть положительной (передано: %.2f)%n", owner, amount);
            return;
        }
        balance += amount;
        System.out.printf("[%s] Пополнение на %.2f руб. Новый баланс: %.2f руб.%n", owner, amount, balance);
    }

    // Метод снятия денег
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.printf("[%s] Ошибка: сумма снятия должна быть положительной (передано: %.2f)%n", owner, amount);
            return false;
        }
        if (amount > balance) {
            System.out.printf("[%s] Ошибка снятия: недостаточно средств (запрошено: %.2f руб., на счете: %.2f руб.)%n",
                    owner, amount, balance);
            return false;
        }
        balance -= amount;
        System.out.printf("[%s] Снятие %.2f руб. Новый баланс: %.2f руб.%n", owner, amount, balance);
        return true;
    }

    // Метод вывода информации
    public void displayInfo() {
        System.out.printf("Счет владельца [%s] | Баланс: %.2f руб.%n", owner, balance);
    }
}
