public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("task1:");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2:");
        short clientDeviceYear = 2015;
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println((clientDeviceYear < 2015)? "Установите облегченную версию приложения для iOS по ссылке":"Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1) {
            System.out.println((clientDeviceYear < 2015) ? "Установите облегченную версию приложения для Android по ссылке" : "Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3:");
        short year = 2021;
        if (year < 1) {
            System.out.println("год не может быть отрицательным или нулевым числом");
        }
        else if (year % 4 != 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год является високосным");
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4:");
        short deliveryDistance = 95;
        short deliveryDistanceZone1 = 20, deliveryDistanceZone2 = 60, deliveryDistanceZone3 = 100;
        short baseDeliveryTime = 1;
        if (deliveryDistance < 1) {
            System.out.println("неверно задано расстояние доставки");
        } else if (deliveryDistance <= deliveryDistanceZone1) {
            System.out.println("На доставку потребуется дней: " + baseDeliveryTime);
        } else if (deliveryDistance <= deliveryDistanceZone2) {
            System.out.println("На доставку потребуется дней: " + (baseDeliveryTime + 1));
        } else if (deliveryDistance <= deliveryDistanceZone3) {
            System.out.println("На доставку потребуется дней: " + (baseDeliveryTime + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет!");
        }
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5:");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("время года - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("время года - осень");
                break;
            default:
                System.out.println("номер месяца введен с ошибкой!");
        }
    }
}