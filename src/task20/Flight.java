package task20;

/**
 * Класс Flight представляет авиарейс с номером, пунктом назначения и числом свободных мест.
 */
public class Flight {
    // Поля класса
    public String flightNumber;
    public String destination;
    public int availableSeats;

    // Конструктор с валидацией
    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        if (availableSeats < 0) {
            System.out.println("Предупреждение: количество мест не может быть отрицательным. Установлено 0.");
            this.availableSeats = 0;
        } else {
            this.availableSeats = availableSeats;
        }
    }

    // Метод бронирования одного места
    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.printf("[%s -> %s] Место успешно забронировано! Осталось свободных мест: %d%n",
                    flightNumber, destination, availableSeats);
            return true;
        } else {
            System.out.printf("[%s -> %s] Ошибка бронирования: свободных мест нет!%n",
                    flightNumber, destination);
            return false;
        }
    }

    // Дополнительный метод бронирования нескольких мест
    public boolean bookSeats(int count) {
        if (count <= 0) {
            System.out.println("Ошибка: число мест для бронирования должно быть положительным.");
            return false;
        }
        if (count <= availableSeats) {
            availableSeats -= count;
            System.out.printf("[%s -> %s] Забронировано %d мест. Осталось свободных мест: %d%n",
                    flightNumber, destination, count, availableSeats);
            return true;
        } else {
            System.out.printf("[%s -> %s] Ошибка бронирования: запрошено %d мест, но доступно только %d!%n",
                    flightNumber, destination, count, availableSeats);
            return false;
        }
    }

    // Метод вывода информации о рейсе
    public void displayInfo() {
        System.out.printf("Рейс %-7s | Направление: %-15s | Свободных мест: %d%n",
                flightNumber, destination, availableSeats);
    }
}
