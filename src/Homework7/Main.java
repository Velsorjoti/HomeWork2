package Homework7;

public class Main {

    public static void Main(String[] args) {
        Author beatifulSusanaClark = new Author("Кларк", "Сюзанна");
        Book epicJoAndStr = new Book("Джонатан Стренндж и мистер Норелл" , 2006);
        Author coolPeterWatts = new Author("Уоттс", "Питер");
        Book fantasticalBlindSight = new Book("Ложная слепота",2009);
        int a = 2019;
        fantasticalBlindSight.setYearPublication(a);
    }
}
