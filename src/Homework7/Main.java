package Homework7;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Author beatifulSusanaClark = new Author("Кларк", "Сюзанна");
        int a = 2006;
        Book epicJoAndStr = new Book("Джонатан Стренндж и мистер Норелл", beatifulSusanaClark.nameAuthor + " " + beatifulSusanaClark.familyAuthor, a);
        Author coolPeterWatts = new Author("Уоттс", "Питер");
        int b = 2009;
        Book fantasticalBlindSight = new Book("Ложная слепота", coolPeterWatts.nameAuthor + " " + coolPeterWatts.familyAuthor, b);
        int c = 2019;
        fantasticalBlindSight.setYearPublication(c);
        System.out.println(" Имя автора: " + coolPeterWatts.nameAuthor + ".");
        System.out.println(" Новый год публикации: " + fantasticalBlindSight.yearPublication + ".");
        System.out.println(" Имя автора: " + beatifulSusanaClark.nameAuthor + "." + " Фамилия автора: " + beatifulSusanaClark.familyAuthor + ".");
        System.out.println(" Имя автора: " + coolPeterWatts.nameAuthor + "." + " Фамилия автора: " + coolPeterWatts.familyAuthor + ".");
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

    public static int compare(int d, int s) {
            if (d == s) {
                System.out.println(" Хешкоды  равны. ");
                return d;
             } else {
                System.out.println(" Хешкоды не равны. ");
                return d;
            }
    }
}

