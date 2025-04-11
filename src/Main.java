public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        //Задача 1
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке.");
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        short clientDeviceYear = 2016;
        if (clientDeviceYear > 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке.");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        short year = 2021;
        if (year % 4 != 0) {
            System.out.println(year + " не високосный год.");
        } else if (year % 400 == 0) {
            System.out.println(year + " високосный год.");
        } else if (year % 100 == 0) {
            System.out.println(year + " не високосный год.");
        } else System.out.println(year + " високосный год.");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        byte time = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: " + (time +1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (time +2));
        } else System.out.println("Доставки нет.");
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
    }
}