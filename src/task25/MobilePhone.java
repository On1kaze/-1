package task25;

/**
 * Класс MobilePhone представляет мобильный телефон с уровнем заряда и состоянием включения.
 */
public class MobilePhone {
    // Поля класса
    public String brand;
    public int batteryLevel; // в процентах (0 - 100)
    public boolean isOn;

    // Конструктор с валидацией уровня заряда
    public MobilePhone(String brand, int batteryLevel) {
        this.brand = brand;
        this.isOn = false; // По умолчанию телефон выключен
        setBatteryLevel(batteryLevel);
    }

    // Вспомогательный метод установки заряда с ограничением [0..100]
    private void setBatteryLevel(int level) {
        if (level < 0) {
            this.batteryLevel = 0;
        } else if (level > 100) {
            this.batteryLevel = 100;
        } else {
            this.batteryLevel = level;
        }
    }

    // Метод включения телефона
    public void turnOn() {
        if (batteryLevel == 0) {
            System.out.println("[" + brand + "] Невозможно включить: батарея полностью разряжена (0%)! Требуется зарядка.");
            return;
        }
        if (isOn) {
            System.out.println("[" + brand + "] Телефон уже включен.");
            return;
        }
        isOn = true;
        System.out.println("[" + brand + "] Телефон включен. Уровень заряда: " + batteryLevel + "%");
    }

    // Метод выключения телефона
    public void turnOff() {
        if (!isOn) {
            System.out.println("[" + brand + "] Телефон уже выключен.");
            return;
        }
        isOn = false;
        System.out.println("[" + brand + "] Телефон выключен.");
    }

    // Метод расхода заряда батареи
    public void usePhone(int batteryCost) {
        if (!isOn) {
            System.out.println("[" + brand + "] Ошибка: телефон выключен! Включите его перед использованием.");
            return;
        }
        if (batteryCost <= 0) {
            System.out.println("[" + brand + "] Некорректный расход заряда (должен быть > 0).");
            return;
        }

        System.out.printf("[%s] Использование устройства... (расход %d%%)%n", brand, batteryCost);
        batteryLevel -= batteryCost;

        if (batteryLevel <= 0) {
            batteryLevel = 0;
            isOn = false;
            System.out.println("[" + brand + "] Батарея разрядилась до 0%! Телефон автоматически выключился.");
        } else {
            System.out.println("[" + brand + "] Текущий заряд: " + batteryLevel + "%");
        }
    }

    // Метод зарядки
    public void charge(int amount) {
        if (amount <= 0) {
            System.out.println("Ошибка: процент зарядки должен быть больше 0.");
            return;
        }
        batteryLevel = Math.min(100, batteryLevel + amount);
        System.out.printf("[%s] Телефон заряжен на %d%%. Текущий уровень: %d%%%n", brand, amount, batteryLevel);
    }

    // Метод вывода информации
    public void displayStatus() {
        System.out.printf("Телефон: %-10s | Состояние: %-9s | Батарея: %3d%%%n",
                brand, (isOn ? "ВКЛЮЧЕН" : "ВЫКЛЮЧЕН"), batteryLevel);
    }
}
