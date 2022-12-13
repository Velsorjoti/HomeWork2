package Homework7;

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
}
