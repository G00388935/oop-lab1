package ie.atu.oop.week1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

 public class Main
 {
     public static void main(String[] args)
     {
         LibraryService service = new LibraryService();
         BookFileStore store = new BookFileStore(
                 Path.of("data", "books.csv"));

         try {
             for (Book book : store.load()) {
                 service.addBook(book);
             }
             System.out.println("Loaded: " + service.getBookCount());
         }
         catch (IOException ex) {
             System.out.println("Load failed: " + ex.getMessage());
             return;
         }

         if (service.getBookCount() == 0) {
             Book dune = new Book("Dune", "Frank Herbert", 412);
             Book cleanCode = new Book(
                     "Clean Code", "Robert C. Martin", 464);

             service.addBook(dune);
             service.addBook(cleanCode);
             service.loanBook("Dune", 7);
         }

         for (Book book : service.getBooks()) {
             System.out.println(
                     book.getTitle() + " - " +
                             book.getStatus());
         }

         try {
             store.save(service.getBooks());
             System.out.println("Saved: " + service.getBookCount());
         }
         catch (IOException ex) {
             System.out.println("Save failed: " + ex.getMessage());
         }
         /* Lab 4>
         Book myBook = new Book("Dune", "Frank Herbert", 412);

         Book myBook2 = new Book("Clean Code", "Robert C. Martin", 464);

         Book myBook3 = new Book("1984", "George Orwell", 328);

         LibraryService service = new LibraryService();

         service.addBook(myBook);
         service.addBook(myBook2);
         service.addBook(myBook3);

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
      <  lab 4*/
     }
 }