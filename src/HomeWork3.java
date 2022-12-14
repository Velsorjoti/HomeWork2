public class HomeWork3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    public static void task1() {
        System.out.println("Задача № 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача № 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println(" Задача № 3 ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println(" Задача № 4 ");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println(" Задача № 5 ");
        for (int i = 1904; i < 2097; i = i + 4) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным. ");
            }
        }
    }

    public static void task6() {
        System.out.println(" Задача № 6 ");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print("" + i + " ");
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println(" Задача № 7 ");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
    }

    public static void task8() {
        System.out.println(" Задача № 8 ");
        int deposit = 29000;
        int bank = 0;
        for (int i = 1; i < 13; i++) {
            bank += deposit;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + bank);
        }
    }

    public static void task9() {
        System.out.println(" Задача № 9 ");
        int deposit = 29000;
        int bank = 0;
        for (int i = 1; i < 13; i++) {
            bank = bank + bank / 100;
            bank = bank + deposit;
            System.out.println(" Месяц " + i + " сумма накоплений с процентами равна " + bank);
        }
    }

    public static void task10() {
        System.out.println(" Задача № 10 ");
        int a = 0;
        int b = 1;
        int c;
        System.out.print( "1" + " ");
        for (int i = 1; i < 11; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c + " ");
        }
        System.out.println(" ");
    }

    public static void task11() {
        System.out.println(" Задача № 11 ");
        int allMoney = 0;
        int dep = 15_000;
        int i = 0;
        while (allMoney < 2_459_000) {
            allMoney += dep;
            i += 1;
            System.out.println(" Месяц " + i + " количество накоплений равно " + allMoney);
        }
    }

    public static void task12() {
        System.out.println(" Задача № 12 ");
        int a = 0;
        while (a < 10) {
            a += 1;
            System.out.print(" " + a + " ");
        }
        System.out.println(" ");
        for (int i = 11; i > 1; ) {
            i -= 1;
            System.out.print(" " + i + " ");
        }
        System.out.println(" ");
    }

    public static void task13() {
        System.out.println(" Задача № 13 ");
        int Y = 12000000;
        int birthPerThousnd = 17;
        int deathPerThousnd = 8;
        int differencePerThousnd = birthPerThousnd - deathPerThousnd;
        for (int i = 1; i < 11; i++) {
            Y = Y + Y / 1000 * differencePerThousnd;
            System.out.println(" Год " + i + ", численность населения составляет " + Y);
        }
    }

    public static void task14() {
        System.out.println(" Задача № 14 ");
        int mounth = 0;
        int deposit = 15000;
        int reqAmo = 0;
        while (reqAmo <= 1200000) {
            mounth = mounth + 1;
            reqAmo += deposit + (reqAmo + deposit) / 100 * 7;
            System.out.println(" Месяц " + mounth + " накопленные средства составляют " + reqAmo);
        }
    }

    public static void task15() {
        System.out.println(" Задача № 15 ");
        int mounth = 0;
        int deposit = 15000;
        int reqAmo = 0;
        while (reqAmo <= 1200000) {
            mounth = mounth + 1;
            reqAmo += deposit + (reqAmo + deposit) / 100 * 7;
            if (mounth % 6 == 0) {
                System.out.println(mounth + " сумма накоплений равна " + reqAmo);
            }
        }
    }

    public static void task16() {
        System.out.println(" Задача № 16 ");
        int allMoney = 0;
        int moneyPerMounth = 15000;
        int allMounth = 12 * 9;
        for (int i = 1; i <= allMounth; i++) {
            allMoney = allMoney + allMoney / 100 * 7;
            allMoney += moneyPerMounth;
        }
        int aM = 0;
        int mPM = 15000;
        int mounth = 0;
        while (aM < allMoney) {
            aM = aM + aM / 100 * 7;
            aM = aM + mPM;
            mounth += 1;
            if (mounth % 6 == 0) {
                System.out.println(" Месяц " + mounth + " накопленно средств " + aM);
            }
        }
        System.out.println(" Всего месяцев " + mounth);
    }

    public static void task17() {
        System.out.println(" Задача № 17 ");
        int friday = 1;
        System.out.println(" Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет. ");
        while (friday < 24) {
            friday += 7;
                System.out.println( " Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет. " );
            }
        }

        public  static  void  task18() {
        System.out.println(" Задача № 18 ");
            int Years = 0;
            while(Years < 2122) {
                Years += 79;
                boolean lastTwoHundredYears = Years > 1822 && Years < 2022;
                if(lastTwoHundredYears) {
                    System.out.println(Years);
                }
                boolean inFutureOneHundredYears = Years > 2022 && Years < 2122;
                if(inFutureOneHundredYears) {
                    System.out.println(Years);
                }
            }
        }
    }


