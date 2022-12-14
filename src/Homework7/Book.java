package Homework7;

public class Book {
     String nameComposition;
     String Author;
     int yearPublication;

    public Book (String nameComposition, String Author, int yearPublication ) {
        this.nameComposition = nameComposition;
        this.Author = Author;
        this.yearPublication = yearPublication;
    }

    public String getNameComposition(){
        return this.nameComposition;
    }

    public String getauthor() {
        return  this.Author;
    }

    public int getYearPublication() {
        return  this.yearPublication;
    }

    public void setNameComposition(String nameComposition) {
        this.nameComposition = nameComposition;
    }

    public void  setAuthor () {
        this.Author = Author;

    }

    public  void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString () {
        return " Название произведения: " + nameComposition + ". Имя автора: " + Author + ". Год публикации: " + yearPublication + ". ";
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Object = (Book) other;
        return Author.equals(Object.Author);
    }

    public int hashCode() {
        return java.util.Objects.hash(yearPublication);
    }
}


