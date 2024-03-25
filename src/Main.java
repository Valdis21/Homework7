public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1
        int saving = 15000;
        int total = 0;
        int mounth = 0;
        while (total <= 2_495_000) {
            total = total + total / 100;
            total = total + saving;
            mounth++;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + total + " рублей.");
        }

        // Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }
        System.out.println();


        // Задача 3
        int popularPeople = 12_000_000;
        int newPeople = 17;
        int deadPeople = 8;
        int yers = 0;
        while (yers < 10) {
            newPeople = popularPeople * newPeople / 1000;
            deadPeople = popularPeople * deadPeople / 1000;
            yers++;
            popularPeople = popularPeople + newPeople + deadPeople;
            System.out.println("Год " + yers + " численность населения составляет " + popularPeople + " человек");
        }

        // Задача 4
        int contribution = 15_000;
        mounth = 0;
        while (contribution <= 12_000_000) {
            mounth++;
            contribution = contribution + contribution * 7 / 100;
            System.out.println("Месяц " + mounth + " сумма накоплений " + contribution + " рублей.");
        }


        // Задача 5
        contribution = 15_000;
        mounth = 0;
        while (contribution < 12_000_000) {
            mounth++;
            contribution = contribution + contribution * 7 / 100;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + contribution + " рублей.");
            }
        }

        //Задача 6
        contribution = 15_000;
        mounth = 0;
        for (; mounth <= 108; mounth++) {
            contribution = contribution + contribution * 7 / 100;
            if (mounth % 6 == 00) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + contribution + " рублей.");
            }
        }

        // Задача 7
        int friday = 1;
        while (friday < 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет!");
            friday += 7;

        }


        // Задача 8
        int yearNow = 2024;
        int yearEarlier = 200;
        int yearLater = 100;
        int cometFlight = 79;
        int year = 0;
        int startYear = yearNow - yearEarlier;
        int endYear = yearNow + yearLater;
        for (int cometArrival = startYear; cometArrival <= endYear; cometArrival++) {
            year++;
            if (cometArrival % cometFlight == 0) {
                System.out.println(cometArrival);
            }
        }
    }
}
