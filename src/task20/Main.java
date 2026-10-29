package task20;

/**
 * Задание 20. Класс Flight.
 * Создай класс авиарейса с полями flightNumber, destination и availableSeats.
 * Добавь метод бронирования места, который уменьшает количество свободных мест, если они есть.
 * Проверено на двух объектах.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 20: Класс Flight ===");

        // Создание двух рейсов с помощью new
        Flight flight1 = new Flight("SU-1122", "Сочи", 2);
        Flight flight2 = new Flight("TK-401", "Стамбул", 150);

        // Прямой доступ к полям
        System.out.println("Рейс 1 (поля): " + flight1.flightNumber + ", куда: " + flight1.destination + ", мест: " + flight1.availableSeats);
        System.out.println("Рейс 2 (поля): " + flight2.flightNumber + ", куда: " + flight2.destination + ", мест: " + flight2.availableSeats);

        System.out.println("\n--- Бронирование на рейс 1 (всего 2 места) ---");
        flight1.bookSeat(); // 1 осталось
        flight1.bookSeat(); // 0 осталось
        flight1.bookSeat(); // Отказ (мест нет)

        System.out.println("\n--- Бронирование на рейс 2 ---");
        flight2.bookSeat();
        flight2.bookSeats(10);

        System.out.println("\nИтоговое состояние рейсов:");
        flight1.displayInfo();
        flight2.displayInfo();
    }
}
