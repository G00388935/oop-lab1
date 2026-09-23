package ie.atu.oop.week1;

public class book {

    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Page count: " + pageCount);
        System.out.println("Book Available: " + available);
    }

}
