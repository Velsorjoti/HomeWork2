package Homework7;

public class Book {
     String nameComposition;
     Author author;
     int yearPublication;

    public Book (String nameComposition, Author author, int yearPublication ) {
        this.nameComposition = nameComposition;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameComposition(){
        return this.nameComposition;
    }

    public Author getauthor() {
        return  this.author;
    }

    public int getYearPublication() {
        return  this.yearPublication;
    }

    public void setNameComposition(String nameComposition) {
        this.nameComposition = nameComposition;
    }

    public void   setAuthor () {
        this.author = author;
    }

    public  void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString () {
        return " Название произведения: " + nameComposition + ". Имя автора: " + author + ". Год публикации: " + yearPublication + ". ";
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Object = (Book) other;
        return author.equals(Object.author);
    }

    public int hashCode() {
        return java.util.Objects.hash(yearPublication);
    }
}


