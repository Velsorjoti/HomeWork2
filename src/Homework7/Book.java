package Homework7;

public class Book {
    private String nameComposition;
    private Author author;
    private int yearPublication;

    public Book (String nameComposition, Author author, int yearPublication ) {
        this.nameComposition = nameComposition;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameComposition(){
        return this.nameComposition;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return  this.yearPublication;
    }
    public void setNameComposition(String nameComposition) {
        this.nameComposition = nameComposition;
    }

    public void  setAuthor (Author author) {
        this.author = author;
    }

    public  void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

