package Homework7;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Author {
    String nameAuthor;
    String familyAuthor;

    public Author (String familyAuthor, String nameAuthor) {
        this.familyAuthor = familyAuthor;
        this.nameAuthor = nameAuthor;
    }

    public String getFamilyAuthor () {
        return this.familyAuthor;
    }

    public String getNameAuthor () {
        return this.nameAuthor;
    }
    public void setFamilyAuthor (String familyAuthor) {
        this.familyAuthor = familyAuthor;
    }

    public  void  setNameAuthor (String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public  String toString() {
        return " Имя автора: " + nameAuthor + ". Фамилия Автора: " + familyAuthor + ".";
    }

    public boolean equals( Object obj ) {
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Author Object = (Author) obj;
        return familyAuthor.equals(Object.familyAuthor);
    }

    public int hashCode() {
        return java.util.Objects.hash(familyAuthor);
    }

}
