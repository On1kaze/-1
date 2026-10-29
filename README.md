# Практическая работа: Классы и объекты в Java (30 заданий)

Комплексный учебно-практический проект, реализующий **30 практических заданий** по объектно-ориентированному программированию на языке Java.

---

## 📌 Ключевые требования и особенности реализации

Все задания выполнены в строгом соответствии с установленными требованиями:

1. **Класс в отдельном файле `.java`**:
   - Каждый создаваемый класс (`Student`, `Car`, `Book`, `Phone`, `Cat`, `Dog`, `Rectangle`, `Circle`, `Employee`, `Laptop`, `BankAccount`, `Product`, `Counter`, `Movie`, `Temperature`, `Point`, `ShoppingCart`, `Clock`, `Flight`, `Computer`, `LibraryBook`, `MobilePhone`, `Player`, `Warehouse`, `Teacher`, `Course`) вынесен в отдельный файл `.java`.
   - Для каждого задания предусмотрен отдельный класс `Main.java` с точкой входа `main`.

2. **Поля и методы внутри классов**:
   - Поля спроектированы с подходящими типами данных (`String`, `int`, `double`, `boolean`, коллекции).
   - Методы инкапсулируют поведение объектов: расчет площадей, конвертация температур, пополнение/снятие денег, расчет стоимости, такты часов, атаки персонажей и др.

3. **Инстанцирование через оператор `new`**:
   - Все объекты создаются динамически в куче (`heap`) с помощью оператора `new` и параметризованных конструкторов.

4. **Прямое обращение к полям и вызов методов через объекты**:
   - В каждом задании наглядно продемонстрирован доступ к полям объекта (`obj.field`) и вызов методов (`obj.method()`).

5. **Тестирование минимум на двух объектах**:
   - Каждое задание протестировано на независимых экземплярах (в заданиях № 4 и 21 — на 3 объектах, в № 24 — на 5 объектах, в № 30 — на группе взаимосвязанных объектов).
   - В задании № 22 наглядно доказана полная изоляция состояния разных объектов в памяти: изменение одного счета не затрагивает другой.

6. **Проверка корректности вводимых данных (Data Validation)**:
   - В заданиях повышенной сложности реализована строгая валидация:
     - **Финансы (`BankAccount`)**: запрет пополнения/снятия отрицательных сумм, защита от овердрафта (нельзя снять больше текущего баланса).
     - **Склад (`Warehouse`)**: запрет добавления товара сверх вместимости (`capacity`) и запрет списания свыше фактического остатка.
     - **Игровой персонаж (`Player`)**: ограничение здоровья снизу (здоровье не опускается ниже 0), запрет атак мертвым или по мертвому персонажу.
     - **Смартфон (`MobilePhone`)**: ограничение уровня заряда (0–100%), автовыключение при 0%, запрет действий с выключенным телефоном.
     - **Автомобиль (`Car`)**: учет расхода топлива, отслеживание исчерпания бака, запрет поездок на отрицательные дистанции.
     - **Геометрия (`Rectangle`, `Circle`)**: проверка положительности размеров и радиуса.
     - **Рейсы (`Flight`)**: запрет бронирования при отсутствии свободных мест.
     - **Часы (`Clock`)**: валидация диапазонов времени (0–23 ч, 0–59 мин, 0–59 сек).
     - **Температура (`Temperature`)**: защита от значений ниже абсолютного нуля (-273.15 °C).
     - **Оценки (`Student`)**: валидация диапазона баллов (0–100).
     - **Библиотека (`LibraryBook`)**: запрет повторной выдачи уже выданной книги.
     - **Университет (`Course`)**: запрет превышения вместимости курса и повторного зачисления одного студента.

---

## 🗂 Структура проекта

```text
.
├── .gitignore                      # Исключения Git (bin, *.class, sources.txt, etc.)
├── README.md                       # Подробная документация
├── run.bat                         # Скрипт сборки и запуска для Windows (cmd)
├── run.ps1                         # Скрипт сборки и запуска для PowerShell
└── src/
    ├── RunAllTasks.java            # Главный класс для запуска всех/отдельных заданий
    ├── task01/                     # Задание 1: Класс Student
    │   ├── Student.java
    │   └── Main.java
    ├── task02/                     # Задание 2: Класс Car
    │   ├── Car.java
    │   └── Main.java
    ├── task03/                     # Задание 3: Класс Book
    │   ├── Book.java
    │   └── Main.java
    ├── task04/                     # Задание 4: Класс Phone
    │   ├── Phone.java
    │   └── Main.java
    ├── task05/                     # Задание 5: Класс Cat
    │   ├── Cat.java
    │   └── Main.java
    ├── task06/                     # Задание 6: Класс Dog
    │   ├── Dog.java
    │   └── Main.java
    ├── task07/                     # Задание 7: Класс Rectangle
    │   ├── Rectangle.java
    │   └── Main.java
    ├── task08/                     # Задание 8: Класс Circle
    │   ├── Circle.java
    │   └── Main.java
    ├── task09/                     # Задание 9: Класс Employee
    │   ├── Employee.java
    │   └── Main.java
    ├── task10/                     # Задание 10: Класс Laptop
    │   ├── Laptop.java
    │   └── Main.java
    ├── task11/                     # Задание 11: Класс BankAccount
    │   ├── BankAccount.java
    │   └── Main.java
    ├── task12/                     # Задание 12: Класс Product
    │   ├── Product.java
    │   └── Main.java
    ├── task13/                     # Задание 13: Класс Student с оценками
    │   ├── Student.java
    │   └── Main.java
    ├── task14/                     # Задание 14: Класс Counter
    │   ├── Counter.java
    │   └── Main.java
    ├── task15/                     # Задание 15: Класс Movie
    │   ├── Movie.java
    │   └── Main.java
    ├── task16/                     # Задание 16: Класс Temperature
    │   ├── Temperature.java
    │   └── Main.java
    ├── task17/                     # Задание 17: Класс Point
    │   ├── Point.java
    │   └── Main.java
    ├── task18/                     # Задание 18: Класс ShoppingCart
    │   ├── ShoppingCart.java
    │   └── Main.java
    ├── task19/                     # Задание 19: Класс Clock
    │   ├── Clock.java
    │   └── Main.java
    ├── task20/                     # Задание 20: Класс Flight
    │   ├── Flight.java
    │   └── Main.java
    ├── task21/                     # Задание 21: Класс Computer
    │   ├── Computer.java
    │   └── Main.java
    ├── task22/                     # Задание 22: BankAccount (изоляция объектов)
    │   ├── BankAccount.java
    │   └── Main.java
    ├── task23/                     # Задание 23: Класс LibraryBook
    │   ├── LibraryBook.java
    │   └── Main.java
    ├── task24/                     # Задание 24: Класс StudentGroup (поиск лучшего студента)
    │   ├── Student.java
    │   └── Main.java
    ├── task25/                     # Задание 25: Класс MobilePhone
    │   ├── MobilePhone.java
    │   └── Main.java
    ├── task26/                     # Задание 26: Класс Car с пробегом
    │   ├── Car.java
    │   └── Main.java
    ├── task27/                     # Задание 27: Класс Order
    │   ├── Order.java
    │   └── Main.java
    ├── task28/                     # Задание 28: Класс Player (битва персонажей)
    │   ├── Player.java
    │   └── Main.java
    ├── task29/                     # Задание 29: Класс Warehouse
    │   ├── Warehouse.java
    │   └── Main.java
    └── task30/                     # Задание 30: Мини-проект «Система управления университетом»
        ├── Student.java
        ├── Teacher.java
        ├── Course.java
        └── Main.java
```

---

## 📋 Список заданий

| № | Название | Основной класс | Поля класса | Реализованные методы |
|---|---|---|---|---|
| **01** | Студент | `Student` | `name`, `age`, `group` | `displayInfo()` |
| **02** | Автомобиль | `Car` | `brand`, `model`, `year` | `displayInfo()` |
| **03** | Книга | `Book` | `title`, `author`, `pages` | `displayInfo()` |
| **04** | Телефон | `Phone` | `brand`, `model`, `price` | `displayInfo()` |
| **05** | Кошка | `Cat` | `name`, `age` | `meow()`, `displayInfo()` |
| **06** | Собака | `Dog` | `name`, `breed` | `bark()`, `displayInfo()` |
| **07** | Прямоугольник | `Rectangle` | `width`, `height` | `calculateArea()`, `calculatePerimeter()`, `displayInfo()` |
| **08** | Круг | `Circle` | `radius` | `calculateArea()`, `calculateCircumference()`, `displayInfo()` |
| **09** | Сотрудник | `Employee` | `name`, `position`, `salary` | `displayInfo()` |
| **10** | Ноутбук | `Laptop` | `brand`, `ram`, `price` | `comparePrice(Laptop)`, `displayInfo()` |
| **11** | Банковский счёт | `BankAccount` | `owner`, `balance` | `deposit(double)`, `withdraw(double)`, `displayInfo()` |
| **12** | Товар | `Product` | `name`, `price`, `quantity` | `calculateTotalValue()`, `displayInfo()` |
| **13** | Студент с оценками | `Student` | `name`, `grade` | `hasPassed()`, `displayResult()` |
| **14** | Счётчик | `Counter` | `count` | `increment()`, `decrement()`, `reset()`, `getCount()` |
| **15** | Фильм | `Movie` | `title`, `genre`, `duration` | `getMovieInfo()`, `displayInfo()` |
| **16** | Температура | `Temperature` | `celsius` | `toFahrenheit()`, `toKelvin()`, `displayInfo()` |
| **17** | Точка плоскости | `Point` | `x`, `y` | `distanceToOrigin()`, `distanceTo(Point)`, `displayInfo()` |
| **18** | Корзина покупок | `ShoppingCart` | `productName`, `price`, `quantity` | `calculateTotal()`, `setQuantity(int)`, `displayInfo()` |
| **19** | Часы | `Clock` | `hours`, `minutes`, `seconds` | `displayTime()`, `tick()`, `setTime(int, int, int)` |
| **20** | Авиарейс | `Flight` | `flightNumber`, `destination`, `availableSeats` | `bookSeat()`, `bookSeats(int)`, `displayInfo()` |
| **21** | Компьютер | `Computer` | `brand`, `processor`, `ram`, `price` | `displaySpecs()` |
| **22** | Банк (несколько счетов) | `BankAccount` | `owner`, `balance` | `deposit(double)`, `withdraw(double)`, `displayInfo()` |
| **23** | Библиотечная книга | `LibraryBook` | `title`, `author`, `isAvailable` | `borrowBook()`, `returnBook()`, `displayInfo()` |
| **24** | Группа студентов | `Student` | `name`, `averageGrade` | `displayInfo()`, алгоритм поиска студента с max баллом |
| **25** | Мобильный телефон | `MobilePhone` | `brand`, `batteryLevel`, `isOn` | `turnOn()`, `turnOff()`, `usePhone(int)`, `charge(int)` |
| **26** | Автомобиль с пробегом | `Car` | `brand`, `mileage`, `fuel`, `consumptionPer100Km` | `drive(double)`, `refuel(double)`, `displayStatus()` |
| **27** | Заказ | `Order` | `orderNumber`, `productName`, `price`, `quantity` | `calculateTotal()`, `setQuantity(int)`, `displayOrder()` |
| **28** | Игровой персонаж | `Player` | `name`, `health`, `damage` | `attack(Player)`, `takeDamage(int)`, `isAlive()`, `displayStatus()` |
| **29** | Склад товаров | `Warehouse` | `productName`, `quantity`, `capacity` | `addProduct(int)`, `removeProduct(int)`, `displayStatus()` |
| **30** | Система университета | `Student`, `Teacher`, `Course` | Атрибуты студентов, преподавателей, курсов | `enrollStudent()`, `setTeacher()`, `displayFullCourseReport()` |

---

## 🚀 Запуск и компиляция

### Способ 1. Использование скрипта `run.bat` (Windows cmd)
```cmd
:: Запуск всех 30 заданий подряд:
run.bat

:: Запуск конкретного задания (например, № 30):
run.bat 30
```

### Способ 2. Использование PowerShell (`run.ps1`)
```powershell
# Запуск всех 30 заданий подряд:
.\run.ps1

# Запуск конкретного задания (например, № 28):
.\run.ps1 -Task 28
```

### Способ 3. Ручная компиляция через `javac` и `java`
```bash
# 1. Создание папки для скомпилированных классов
mkdir bin

# 2. Компиляция всех исходных файлов
javac -encoding UTF-8 -d bin src/task*/*.java src/*.java

# 3. Запуск отдельного задания (например, задания 1):
java -cp bin task01.Main

# 4. Или запуск единого менеджера всех заданий:
java -cp bin RunAllTasks
```

---

## 💻 Системные требования
- **JDK**: Java 17, 21 или новее (протестировано на OpenJDK 25)
- **Кодировка консоли**: UTF-8
- **ОС**: Windows, macOS, Linux
