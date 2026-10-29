package task28;

/**
 * Класс Player представляет игрового персонажа с именем, очками здоровья и силой урона.
 */
public class Player {
    // Поля класса
    public String name;
    public int health;
    public int damage;

    // Конструктор с валидацией здоровья и урона
    public Player(String name, int health, int damage) {
        this.name = name;
        this.health = Math.max(0, health);
        this.damage = Math.max(1, damage);
    }

    // Проверка жив ли персонаж
    public boolean isAlive() {
        return health > 0;
    }

    // Метод атаки другого персонажа
    public void attack(Player target) {
        if (!this.isAlive()) {
            System.out.println("[" + name + "] Мёртв и не может атаковать!");
            return;
        }
        if (!target.isAlive()) {
            System.out.println("[" + name + "] Не может атаковать цель [" + target.name + "], так как она уже повержена!");
            return;
        }

        System.out.printf("⚔️ %s атакует %s и наносит %d урона!%n", this.name, target.name, this.damage);
        target.takeDamage(this.damage);
    }

    // Метод получения урона (здоровье не должно опускаться ниже нуля)
    public void takeDamage(int amount) {
        if (amount <= 0) {
            System.out.println("[" + name + "] Урон должен быть больше 0.");
            return;
        }

        health -= amount;
        if (health <= 0) {
            health = 0; // Здоровье не опускается ниже нуля
            System.out.printf("💀 %s получил %d урона и пал в бою (HP: 0)!%n", name, amount);
        } else {
            System.out.printf("🛡️ %s получил %d урона. Осталось HP: %d.%n", name, amount, health);
        }
    }

    // Метод вывода статуса персонажа
    public void displayStatus() {
        System.out.printf("Персонаж: %-10s | HP: %3d | Урон: %2d | Жив: %s%n",
                name, health, damage, (isAlive() ? "Да" : "Нет"));
    }
}
