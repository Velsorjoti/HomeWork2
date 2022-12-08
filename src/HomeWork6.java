import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задача № 1 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int i = scanner.nextInt();
        calculateYears(i);
    }

    public static int calculateYears(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println(i + " год является високосным. ");
        } else {
            System.out.println(i + " год не является високосным. ");
        }
        return i;
    }

    public static void task2() {
        System.out.println(" Задача № 2 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int a = scanner.nextInt();
        System.out.println("");
        int b = scanner.nextInt();
        chekOs(a);
        chekYear(b);
    }

    public  static  int chekOs(int a) {
        if(a == 0) {
            System.out.print("Установите iOs" + "");
        } else {
            System.out.print("Установите версию Android" + "");
        }
        return a;
    }

    public static int chekYear(int b) {
      if(b > 2015 ) {
          System.out.println(" актуальной версии. ");
      } else {
          System.out.println(" облегчёную  версию. ");
      }
      return b;
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int d = scanner.nextInt();
        calculateDistance(d);
    }

    public static int calculateDistance(int d) {
        if (d <= 20) {
            System.out.println(" Вы совсем рядом, доставка дойдёт до вас не позже суток ");
        } else if (d > 20 && d < 60) {
            System.out.println(" Вы живёте на почтительном расстоянии, но именно для вас, доставка прибудет всего за два дня" );
        } else if (d >= 60 && d <= 100) {
            System.out.println(" Вы живёте не близко, но только ради вас доставка, осуществится за три дня ");
        } else if (d > 100) {
            System.out.println(" Ты мучитель курьеров, никакой тебе доставки изувер. ");
        }
        return d;
    }
}

