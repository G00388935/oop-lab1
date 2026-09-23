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

        book secondbook = createBook("Clean Code","Dan Williams",223);
        book thirdbook = createBook("Another Book Code","John Murphy",333);
        book fourthbook = createBook("Student Life","Mary Shelly",443);

        System.out.println("\n");
        secondbook.displayDetails();
        System.out.println("\n");
        thirdbook.displayDetails();
        System.out.println("\n");
        fourthbook.displayDetails();

    }
    private static book createBook(String title, String author, int pageCount)
    {
        book book = new book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}