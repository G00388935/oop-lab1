package ie.atu.oop.week1;


 public class Main {
     public static void main(String[] args)
     {
        try
        {
            Book myBook = new Book("Dune", "Frank", 425);

            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
            System.out.println(myBook.getPageCount());
            //prints title author and page count
            //------------------------------------------------------------
            System.out.println(myBook.getStatus());
            myBook.borrowBook();
            System.out.println(myBook.getStatus());
            //book is shown available then borrowed, then shown on loan
            //------------------------------------------------------------
            try
            {
                myBook.borrowBook();
            }
            catch (IllegalStateException ex)
            {
                System.out.println(ex.getMessage());
            }
            System.out.println(myBook.getStatus());
            //on loan checking
            //-----------------------------------------------------------------
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        //checks to make sure nothing is left blank
     }
 }
