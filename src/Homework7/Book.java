package Homework7;

public class Book {
    private String nameComposition;
    private Object Author;
    private int yearPublication;

    public Book (String nameComposition,Object Author, int yearPublication ) {
        this.nameComposition = nameComposition;
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getNameComposition(){
        return this.nameComposition;
    }

    public Object  getAuthor() {
        return this.Author;
    }

    public int getYearPublication() {
        return  this.yearPublication;
    }
    public void setNameComposition(String nameComposition) {
        this.nameComposition = nameComposition;
    }

    public void  setAuthor (Object Author) {
        this.Author = Author;
    }

    public  void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

