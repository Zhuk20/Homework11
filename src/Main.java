import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void printLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void printVersionProgramOs(int clientOS, int currentYear, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите верные значения");
        }
    }

    public static int deliveryDay(int deliveryDistance) {
        int countDay = 0;
        if (deliveryDistance < 20) {
            countDay += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            countDay += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            countDay += 3;
        }
        return countDay;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3();
    }

    private static void task3() {
        int deliveryDistance = 10;
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDay(deliveryDistance));
        } else {
            System.out.println("Доставка невозможна.");
        }
    }

    private static void task2() {
        int currentYear = LocalDate.now().getYear();
        int clientDeviceYear = 2020;
        int clientOS = 0;
        printVersionProgramOs(clientOS, currentYear, clientDeviceYear);
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        int year = 2000;//scanner.nextInt();
        printLeapYear(year);
    }
}