package Homework7;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Author beatifulSusanaClark = new Author("Кларк", "Сюзанна");
        Book epicJoAndStr = new Book("Джонатан Стренндж и мистер Норелл",beatifulSusanaClark, 2006);
        Author coolPeterWatts = new Author("Уоттс", "Питер");
        Book fantasticalBlindSight = new Book("Ложная слепота",coolPeterWatts , 2009);
        int a = 2019;
        fantasticalBlindSight.setYearPublication(a);
        System.out.println(epicJoAndStr);
        System.out.println(fantasticalBlindSight);
        System.out.println(epicJoAndStr.equals(fantasticalBlindSight));
        System.out.println(beatifulSusanaClark.equals(beatifulSusanaClark));
        System.out.println(Objects.hash(beatifulSusanaClark));
        System.out.println(Objects.hash(coolPeterWatts));
        compare(Objects.hash(beatifulSusanaClark),Objects.hash(coolPeterWatts));
        System.out.println(Objects.hash(fantasticalBlindSight));
        System.out.println(Objects.hash(epicJoAndStr));
        compare(Objects.hash(fantasticalBlindSight),Objects.hash(epicJoAndStr));
    }

    public static int compare(int b, int c) {
            if (b == c) {
                System.out.println(" Хешкоды  равны. ");
                return b;
             } else {
                System.out.println(" Хешкоды не равны. ");
                return b;
            }
    }
}

