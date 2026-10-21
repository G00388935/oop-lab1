package ie.atu.oop.week1;


 public class Main
 {
     public static void main(String[] args)
     {

         Book myBook = new Book("Dune", "Frank Herbert", 412);

         Book myBook2 = new Book("Clean Code", "Robert C. Martin", 464);

         Book myBook3 = new Book("1984", "George Orwell", 328);

         LibraryService service = new LibraryService();

         service.addBook(myBook);
         service.addBook(myBook2);
         service.addBook(myBook3);
/*
         System.out.println("We have " + service.getBookCount() + " books\n" );

         for(Book book : service.getAllBooks())
         {
             System.out.println(book.getTitle());
         }

         Book found = service.findBookByTitle("Dune");

         if (found != null) {
             System.out.println("Found: " + found.getTitle());
         }

         Book missing = service.findBookByTitle("The Hobbit");

         if (missing == null) {
             System.out.println("The Hobbit was not found");
         }

         System.out.println("Remove Clean Code: " + service.removeBook("Clean Code"));

         System.out.println("Remove again: " + service.removeBook("Clean Code"));

         System.out.println("Books left: " + service.getBookCount());
*/
         System.out.println("Count: " + service.getBookCount());

         Book found = service.findBookByTitle("Dune");
         if (found != null) {
             System.out.println("Found: " + found.getTitle());
         }

         System.out.println("Loan Dune: " + service.loanBook("Dune", 7));
         System.out.println("Dune status: " + myBook.getStatus());

         System.out.println("Loan missing: " + service.loanBook("The Hobbit", 7));

         System.out.println("Return Dune: " + service.returnBook("Dune"));
         System.out.println("Dune status: " + myBook.getStatus());

         System.out.println("Remove Clean Code: " + service.removeBook("Clean Code"));
         System.out.println("Final count: " + service.getBookCount());

     }
 }