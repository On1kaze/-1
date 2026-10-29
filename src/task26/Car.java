package task26;

/**
 * Класс Car представляет автомобиль с пробегом и расходом топлива.
 */
public class Car {
    // Поля класса
    public String brand;
    public double mileage; // в километрах
    public double fuel;    // в литрах
    public double consumptionPer100Km; // расход на 100 км (л/100км)

    // Конструктор с валидацией
    public Car(String brand, double mileage, double fuel, double consumptionPer100Km) {
        this.brand = brand;
        this.mileage = Math.max(0.0, mileage);
        this.fuel = Math.max(0.0, fuel);
        this.consumptionPer100Km = (consumptionPer100Km <= 0) ? 8.0 : consumptionPer100Km;
    }

    // Метод поездки: увеличивает пробег и уменьшает запас топлива
    public boolean drive(double distance) {
        if (distance <= 0) {
            System.out.println("[" + brand + "] Ошибка: дистанция поездки должна быть положительной.");
            return false;
        }

        // Расчет требуемого топлива: (distance / 100) * consumptionPer100Km
        double fuelNeeded = (distance / 100.0) * consumptionPer100Km;

        if (fuelNeeded <= fuel) {
            fuel -= fuelNeeded;
            mileage += distance;
            System.out.printf("[%s] Пройдено %.1f км. Израсходовано: %.2f л. Остаток топлива: %.2f л. Общий пробег: %.1f км.%n",
                    brand, distance, fuelNeeded, fuel, mileage);
            return true;
        } else {
            // Топлива недостаточно для всей поездки: проедем сколько возможно
            double possibleDistance = (fuel / consumptionPer100Km) * 100.0;
            mileage += possibleDistance;
            System.out.printf("[%s] Не хватило топлива на %.1f км! Требовалось %.2f л, а было %.2f л.%n",
                    brand, distance, fuelNeeded, fuel);
            System.out.printf("[%s] Автомобиль проехал %.1f км и заглох. Бак пуст (0.0 л). Пробег: %.1f км.%n",
                    brand, possibleDistance, mileage);
            fuel = 0.0;
            return false;
        }
    }

    // Метод заправки
    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("[" + brand + "] Ошибка: объем заправляемого топлива должен быть больше 0.");
            return;
        }
        fuel += amount;
        System.out.printf("[%s] Заправлено %.2f л топлива. Текущий запас: %.2f л.%n", brand, amount, fuel);
    }

    // Метод вывода состояния
    public void displayStatus() {
        System.out.printf("Автомобиль: %-12s | Пробег: %8.1f км | Топливо: %5.2f л | Расход: %.1f л/100км%n",
                brand, mileage, fuel, consumptionPer100Km);
    }
}
