public class Book06 {
    public String isbn;
    public String title;

    public Book06(){

    }

    public Book06(String isbn, String titlr) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + " Title: " + this.title;
    }
}
