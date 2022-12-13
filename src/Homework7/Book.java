package Homework7;

public class Book {
    private String nameComposition;
    private String author;
    private int yearPublication;

    public Book (String nameComposition, String author, int yearPublication ) {
        this.nameComposition = nameComposition;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameComposition(){
        return this.nameComposition;
    }

    public String getauthor() {
        return  this.author;
    }

    public int getYearPublication() {
        return  this.yearPublication;
    }
    public void setNameComposition(String nameComposition) {
        this.nameComposition = nameComposition;
    }

    public void setAuthor (String Author) {
        this.author = Author;
    }

    public  void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

