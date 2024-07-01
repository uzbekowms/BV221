import java.util.Random;
import java.util.Scanner;

public class TestDz {
    //Завдання 2:
//Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток,
//який необхідно підрахувати. Наприклад, ми ввели з клавіатури 50 і 10. Потрібно вивести на екран
//10 відсотків від 50. Результат — 5.

//Завдання 4:
//Користувач вводить шестизначне число. Необхідно змінити в цьому числі перше і шосте число, а
//також друге і п’яте число. Наприклад, 723895 повинно перетворитися на 593827
//Якщо користувач ввів не шестизначне число потрібно вивести повідомлення про помилку.

//Завдання 5:
//Користувач вводить з клавіатури номер місяця(1-12). В залежності від отриманого номера програма
//виводить на екран напис : Winter (якщо введене значення 1,2 або 12), Spring (якщо введене значення від
//3 до 5), Summer (якщо введене значення від 6 до 8), Autumn (якщо введене значення від 9 до 11).
//Якщо користувач ввів значення не в діапазоні від 1 до 12 потрібно вивести повідомлення про помилку.

//Завдання 8:
//Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо
//користувач вказав 3 і 5, таблиця може виглядати так
//3*1 = 3 3*2 = 6 3*3 = 9 ... 3*10 = 30
//5*1 = 5 5*2 = 10 5*3 = 15 ...

    //Завдання 9:
//В одномірному масиві, заповненому випадковими числами, визначаємо мінімальне і
//максимальне значення, підраховуємо кількість від’ємних значень, підраховуємо кількість
//додатних значень, підраховуємо кількість нулів. Результат виводимо на екран.
    private final static Scanner scanner = new Scanner(System.in);

    public static void task2() {
        System.out.print("Гей, я можу знаходити процент з числа. Введи число:");
        double number = scanner.nextDouble();
        System.out.print("а тепер введи процент: ");
        double percent = scanner.nextDouble();
        double result = number * percent / 100;
        System.out.println("Результат:" + result);
    }

    public static void task4() {
        System.out.println("Гей, я можу поміняти місцями цифри (1 з 6 і 2 з 5) в твоєму числі. Введи 6-значне число");
        while (true) {
            int number = scanner.nextInt();
            if (number > 100000 && number < 999999) {
                int firstDigit = number / 100000;
                int secondDigit = (number / 10000) % 10;
                int thirdDigit = (number / 1000) % 10;
                int fourthDigit = (number / 100) % 10;
                int fifthDigit = (number % 100) / 10;
                int sixthDigit = number % 10;
                int result = ((((sixthDigit * 10 + fifthDigit) * 10 + thirdDigit) * 10 + fourthDigit) * 10 + secondDigit) * 10 + firstDigit;
                System.out.println(result);
                break;
            } else {
                System.out.println("Enter a 6-digit number");
            }
        }
    }

    public static void task5() {
        System.out.println("Гей, я можу сказати яка пора року по номеру місяця. Введи номер місяця (з 1 до 12)");
        int monthNumber = scanner.nextInt();
        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Літо";
            case 9, 10, 11 -> "Осінь";
            default -> "НЕМАЄ такого місця. Вчи місяці!";
        };
        System.out.println(season);
    }


    public static void task8() {
        System.out.println("Гей, я можу скласти таблицю множення. Вкажи діапазон (з 1 до 9)");
        int from = 5;
        int to = 8;
//        if (scanner.hasNextInt()) {
//            from = scanner.nextInt();
//        }
//        if (scanner.hasNextInt()) {
//            to = scanner.nextInt();
//        }
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
        }

        for (int i = from; i <= to; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(String.format("%d * %d = %d; ", i, j, i * j));
            }
            System.out.println();
        }

//        if (from != 0 && to != 0) {
//            if (from <= to) {
//                while (from <= to) {
//                    int i = 1;
//                    while (i <= 10) {
//                        System.out.println(from + " * " + i + " = " + from * i);
//                        i++;
//                    }
//                    from++;
//                    System.out.println();
//                }
//            } else {
//                while (from >= to) {
//                    int i = 1;
//                    while (i <= 10) {
//                        System.out.println(from + " * " + i + " = " + from * i);
//                        i++;
//                    }
//                    from--;
//                    System.out.println();
//                }
//            }
//        } else {
//            System.out.println("Погане, дуже погане число");
//        }

    }

    public static void task9() {
        int[] numbers = new int[10];
        Random rd = new Random();
        int i = 0;
        while (i < numbers.length) {
            numbers[i] = rd.nextInt(199) - 99;
            i++;
        }
        int amountOfPositives = 0;
        int amountOfNegatives = 0;
        int amountOfZeros = 0;
        for (int num : numbers) {
            System.out.print(num + " ");
            if (num > 0) {
                amountOfPositives++;
            } else if (num < 0) {
                amountOfNegatives++;
            } else {
                amountOfZeros++;
            }
        }
        System.out.println();
        System.out.println("Кількість додатніх: " + amountOfPositives);
        System.out.println("Кількість від'ємних: " + amountOfNegatives);
        System.out.println("Кількість нулів: " + amountOfZeros);
    }

    public static void main(String[] a) {
        task8();
//
//        while (true) {
//            System.out.println("Оберіть номер завдання (2, 4, 5, 8 або 9)");
//            int task = scanner.nextInt();
//            switch (task) {
//                case 2 -> task2();
//                case 4 -> task4();
//                case 5 -> task5();
//                case 8 -> task8();
//                case 9 -> task9();
//                default -> System.out.println("НЕМАЄ такого завдання");
//            }
//            scanner.next();
//            System.out.println("Exit? (y/n)");
//            char answer = scanner.nextLine().charAt(0);
//            if (answer == 'y' || answer == 'Y') {
//                scanner.close();
//                break;
//            }
//        }
    }
}
