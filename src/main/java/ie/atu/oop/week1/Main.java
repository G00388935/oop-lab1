package ie.atu.oop.week1;


 public class Main {
     public static void main(String[] args) {
         // try
         {
             Book myBook = new Book("Dune", "Frank", 425);

             Book myBook2 = new Book("Clean Code", "Robert C. Martin", 464);
             LibraryService service = new LibraryService();
            /*
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
            System.out.println(myBook.getPageCount());
            //prints title author and page count part 1
            //------------------------------------------------------------
            System.out.println(myBook.getStatus());
            myBook.borrowBook();
            System.out.println(myBook.getStatus());
            //book is shown available then borrowed, then shown on loan part 2
            //------------------------------------------------------------
            try {
                myBook.borrowBook();
            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(myBook.getStatus());
            //on loan checking part 3
            //-----------------------------------------------------------------


            System.out.println(myBook.getStatus());
            myBook.borrowBook();
            System.out.println(myBook.getStatus());
            myBook.returnBook();
            System.out.println(myBook.getStatus());
            //borrows book then returns it part 4-5
            //-----------------------------------------
            myBook.borrowBook();
            myBook.returnBook();
            try {
                myBook.returnBook();
            } catch (IllegalStateException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(myBook.getStatus());
            }
            //part 6
         //-----------------------------------------------------
         */
             System.out.println(myBook.getStatus());
             service.loanBook(myBook, 7);
             System.out.println(myBook.getStatus());
             service.returnBook(myBook);
             System.out.println(myBook.getStatus());
             System.out.println(myBook2.getStatus());
             try {
                 service.loanBook(myBook, 15);
             } catch (IllegalArgumentException ex) {
                 System.out.println(ex.getMessage());
             }
             System.out.println(myBook.getStatus());
         }





             //part 7
             //------------------------------------------------------------------------
         /*
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        //checks to make sure nothing is left blank
         //------------------------------------------------------
     */
         }
 }
