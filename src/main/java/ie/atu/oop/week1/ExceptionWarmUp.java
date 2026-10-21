package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp
{
    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while (!valid)
        {
            System.out.println("Please enter a number: ");
            String text = scan.nextLine();

            try
            {
                int pageCount = Integer.parseInt(text);
                System.out.println("You entered: " + pageCount);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number not words");
            }
        }
        System.out.println("Program continues.");

        // entering a text like ten instead of 10 errors
    }
}
