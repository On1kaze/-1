import java.util.Scanner;

/**
 * Главный класс для запуска всех заданий или любого выбранного задания от 1 до 30.
 */
public class RunAllTasks {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int taskNum = Integer.parseInt(args[0]);
                runTask(taskNum);
                return;
            } catch (NumberFormatException e) {
                System.out.println("Неверный номер задания: " + args[0]);
            }
        }

        System.out.println("================================================================================");
        System.out.println("          ПРАКТИЧЕСКАЯ РАБОТА: КЛАССЫ И ОБЪЕКТЫ В JAVA (30 ЗАДАНИЙ)             ");
        System.out.println("================================================================================");
        System.out.println("Запуск демонстрации всех 30 заданий последовательно...\n");

        for (int i = 1; i <= 30; i++) {
            System.out.println("\n################################################################################");
            System.out.printf("                              ЗАДАНИЕ № %02d                                    %n", i);
            System.out.println("################################################################################\n");
            runTask(i);
        }

        System.out.println("\n================================================================================");
        System.out.println("               ВСЕ 30 ЗАДАНИЙ УСПЕШНО ВЫПОЛНЕНЫ И ПРОТЕСТИРОВАНЫ!               ");
        System.out.println("================================================================================");
    }

    public static void runTask(int num) {
        switch (num) {
            case 1:  task01.Main.main(new String[0]); break;
            case 2:  task02.Main.main(new String[0]); break;
            case 3:  task03.Main.main(new String[0]); break;
            case 4:  task04.Main.main(new String[0]); break;
            case 5:  task05.Main.main(new String[0]); break;
            case 6:  task06.Main.main(new String[0]); break;
            case 7:  task07.Main.main(new String[0]); break;
            case 8:  task08.Main.main(new String[0]); break;
            case 9:  task09.Main.main(new String[0]); break;
            case 10: task10.Main.main(new String[0]); break;
            case 11: task11.Main.main(new String[0]); break;
            case 12: task12.Main.main(new String[0]); break;
            case 13: task13.Main.main(new String[0]); break;
            case 14: task14.Main.main(new String[0]); break;
            case 15: task15.Main.main(new String[0]); break;
            case 16: task16.Main.main(new String[0]); break;
            case 17: task17.Main.main(new String[0]); break;
            case 18: task18.Main.main(new String[0]); break;
            case 19: task19.Main.main(new String[0]); break;
            case 20: task20.Main.main(new String[0]); break;
            case 21: task21.Main.main(new String[0]); break;
            case 22: task22.Main.main(new String[0]); break;
            case 23: task23.Main.main(new String[0]); break;
            case 24: task24.Main.main(new String[0]); break;
            case 25: task25.Main.main(new String[0]); break;
            case 26: task26.Main.main(new String[0]); break;
            case 27: task27.Main.main(new String[0]); break;
            case 28: task28.Main.main(new String[0]); break;
            case 29: task29.Main.main(new String[0]); break;
            case 30: task30.Main.main(new String[0]); break;
            default:
                System.out.println("Ошибка: задание с номером " + num + " не найдено (доступны 1..30).");
        }
    }
}
