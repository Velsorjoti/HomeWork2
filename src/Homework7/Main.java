package Homework7;

public class Main {

    public static void Main(String[] args) {
        Author beatifulSusanaClark = new Author("Кларк", "Сюзанна");
        int a = 2006;
        Book epicJoAndStr = new Book("Джонатан Стренндж и мистер Норелл", beatifulSusanaClark.nameAuthor + beatifulSusanaClark.familyAuthor, a);
        Author coolPeterWatts = new Author("Уоттс", "Питер");
        int b = 2009;
        Book fantasticalBlindSight = new Book("Ложная слепота", coolPeterWatts.nameAuthor + coolPeterWatts.familyAuthor, b);
    }
}
