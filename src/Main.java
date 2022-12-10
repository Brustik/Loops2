public class Main {
    public static void main(String[] args) {

              task1();
              task2();
              task3();
              task4();
              task5();
              task6();
              task7();

        }

        public static void task1() {
            System.out.println("Задача 1");
            int monthNumber = 1;
            int total = 0;
            while (total < 2_459_000) {
                total = total + 15000;
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
                monthNumber++;
            }
        }

        public static void task2() {
            System.out.println();
            System.out.println("Задача 2");
            int i = 1;
            int a = 10;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            for (; a >= 1; a--) {
                System.out.print(a + " ");
            }
        }

        public static void task3() {
            System.out.println();
            System.out.println();
            System.out.println("Задача 3");
            int population = 12_000_000;
            int fertility = (population / 1000) * 17; //рождаемость
            int mortality = (population / 1000) * 8;  //смертность
            int yearNumber = 1;
            while (yearNumber <= 10) {
                population = population + fertility - mortality;
                System.out.println("Год " + yearNumber + ", численность населения составляет " + population);
                yearNumber++;
                }
            }

        public static void task4() {
            System.out.println();
            System.out.println("Задача 4");
            int monthNumber = 1;
            int capital = 0;
            while (capital < 12_000_000) {
                capital = capital + 15000 + (capital/100*7);
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + capital + " рублей");
                monthNumber++;
            }

        }

        public static void task5() {
            System.out.println();
            System.out.println("Задача 5");
            int monthNumber = 1;
            int capital = 0;
            while (capital < 12_000_000) {
                capital = capital + 15000 + (capital / 100 * 7);
                if (monthNumber % 6 == 0) {
                    System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + capital + " рублей");
                }
                monthNumber++;
            }
        }

        public static void task6() {
            System.out.println();
            System.out.println("Задача 6");
            int monthNumber = 1;
            int capital = 0;
            int monthTotal = monthNumber * 12 * 9;
            while (monthNumber <= monthTotal) {
                capital = capital + 15000 + (capital / 100 * 7);
                if (monthNumber % 6 == 0) {
                    System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + capital + " рублей");
                }
                monthNumber++;
            }

        }

        public static void task7() {
            System.out.println();
            System.out.println("Задача 7");
            int firstFriday = 3;

            for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
                if (dayNumber == firstFriday) {
                    System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
                    firstFriday = firstFriday + 7;
                }
            }
        }

        public static void task8() {
            System.out.println();
            System.out.println("Задача 8");


        }
}