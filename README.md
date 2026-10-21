Book Tracker application


Lab 1 lists book title, author, page count and availability from listed books stored

JDK version 24 run in intellij in main.java

object class is called "book"

Book Title: Dune Book Author: Frank Herbert Book Page count: 412 Book Available: true Dune has been borrowed 
Book Title: Dune Book Author: Frank Herbert Book Page count: 412 Book Available: false

null is called before isblanke() as a sort of protection against an error called nullpointexception

when a book has a title author and page count the book like a real one shouldn't change, but it can be 
borrowed and returned making the status changeable 

borrowBook and returnBook are used rather than a status setter as borrowBook can can do a status check of if the book
is borrowed

AVAILABLE
ON_LOAN
ON_LOAN
AVAILABLE
Loan days must be from 1 to 14
ON_LOAN

Lab 3
When running part 7 for part 9 when debugging, the code shows on loan when the first loan takes place the 
Firstbook(myBook) becomes ON_LOAN from Available and stays that way then when it reaches the 15 day code it outputs the 
error code as it is outside the 1 - 14 range

Lab 4 Array list
LibraryService now working with a single supplied Book to owning a List<Book>
it tells the compiler that it holds objects type book
you can change the content of the list but cant make books refer to a different list
adds a new book to the list doesn't change the current
it returns the matching boo object for a known and null for an unknown
findBookByTitle already searches the list for title so a loop is unnecessary
main has the code that starts the program and calls methods to run the program
stores teh books and all the methods to add and remove
represents the books and the code to get the information for them

Count: 3
Found: Dune
Loan Dune: true
Dune status: ON_LOAN
Loan missing: false
Return Dune: true
Dune status: AVAILABLE
Remove Clean Code: true
Final count: 2
