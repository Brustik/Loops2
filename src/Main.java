public class Main {
    public static void main(String[] args) {

              task1();
              task2();
              task3();


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
            }





}