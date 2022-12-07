import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static  void  task1 () {
        System.out.println(" Задача № 1 ");
        String fistName = " Ivan ";
        String middleName = "Ivanovich";
        String surnName = "Ivanov";
        String nameFIO = surnName + fistName + middleName;
        System.out.println(" ФИО сотрудника —  " + nameFIO  + ".");

    }

    public  static  void  task2() {
        System.out.println(" Задача № 2 ");
        String fistName = " Ivan ";
        String middleName = "Ivanovich";
        String surnName = "Ivanov";
        String nameFIO = surnName + fistName + middleName;
        System.out.println( " Данные ФИО сотрудника для заполнения отчета — " + nameFIO.toUpperCase() + "." );
    }

    public  static  void  task3() {
        System.out.println(" Задача № 3 ");
        String fullName = "Иванов Семён Семёнович";
        String bezEFullName = fullName.replace('ё', 'е');
        System.out.println(" Данные ФИО сотрудника — " + bezEFullName + ".");
    }

    public  static  void  task4() {
        System.out.println(" Задача № 4 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String name = scanner.next();
        System.out.println(" Привет " + name + ".");
    }

    public  static  void  task5() {
        System.out.println(" Задача № 5 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int temperature = scanner.nextInt();
        System.out.println(" Температура воздуха сегодня: " + temperature + " градусов.");
    }

    public  static  void  task6() {
        System.out.println(" Задача № 6 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int years = scanner.nextInt();
        System.out.println("");
        String mounth = scanner.next();
        System.out.println("");
        int days = scanner.nextInt();
        System.out.println(days + " : " + mounth + " : " + years + " . ");
    }

    public  static  void  task7() {
        System.out.println(" Задача № 7 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String name = scanner.nextLine();
        System.out.println("");
        String nameAssist = scanner.nextLine();
        System.out.println("");
        int numberMesseng = scanner.nextInt();
        System.out.println(" Привет, " + name + " Это твой помощник " + nameAssist);
        System.out.println(" У тебя " + numberMesseng +  " новых писем. ");



    }
}