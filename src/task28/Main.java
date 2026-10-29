package task28;

/**
 * Задание 28. Класс Player.
 * Создай класс игрового персонажа с полями name, health и damage.
 * Добавь методы атаки другого персонажа и получения урона.
 * Здоровье не должно опускаться ниже нуля.
 * Проверено на двух объектах в пошаговом бою.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 28: Класс Player ===");

        // Создание двух игроков с помощью new
        Player knight = new Player("Рыцарь", 100, 35);
        Player mage = new Player("Маг", 70, 45);

        // Прямой доступ к полям
        System.out.println("Игрок 1 (поля): " + knight.name + " (HP=" + knight.health + ", Урон=" + knight.damage + ")");
        System.out.println("Игрок 2 (поля): " + mage.name + " (HP=" + mage.health + ", Урон=" + mage.damage + ")");

        System.out.println("\n--- Начало сражения ---");
        knight.displayStatus();
        mage.displayStatus();

        System.out.println("\nРаунд 1:");
        knight.attack(mage);
        mage.attack(knight);

        System.out.println("\nРаунд 2:");
        knight.attack(mage); // Маг получает ещё 35 урона (70 - 35 - 35 = 0 HP)

        System.out.println("\nПопытка атаки поверженного персонажа / мертвым персонажем:");
        knight.attack(mage); // Цель уже повержена
        mage.attack(knight); // Мертвый не может атаковать

        System.out.println("\n--- Итог сражения ---");
        knight.displayStatus();
        mage.displayStatus();
        System.out.println("Проверка HP побежденного: mage.health = " + mage.health + " (не опустилось ниже нуля)");
    }
}
