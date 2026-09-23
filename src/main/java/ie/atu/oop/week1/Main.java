package ie.atu.oop.week1;


 public class Main {
    public static void main(String[] args)
    {
        book firstbook = new book();
        firstbook.title = "Dune";
        firstbook.author = "Frank Herbert";
        firstbook.pageCount = 412;

        firstbook.displayDetails();//before
        firstbook.borrowBook();
        firstbook.displayDetails();//after
    }
}