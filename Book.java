/**
 * 
 */

/**
 * Excercise1.1
 * This is a class implemented a Book and this class contains
 * 4 attribute: title, price, yearOfPublication, authorName 
 */
public class Book {
   private String title;
   private double price;
   private int yearOfPublication;
   private String authorName;
   /**
   * Constructor for the Book class.
    *
    * @param title The title of the book.
    * @param price The price of the book (in dollars).
    * @param yearOfPublication The year the book was published.
    * @param authorName The name of the author of the book.
    * 
    * Ex: 
    * new Book("Daniel Defoe", 15.5, 1719, "Robinson Crusoe");
    * new Book("Joseph Conrad", 12.8, 1902, "Heart of Darkness");
    * new Book("Pat Conroy", 9.5, 1996, "Beach Music");
    */
public Book(String title, double price, int yearOfPublication, String authorName) {
	this.title = title;
	this.price = price;
	this.yearOfPublication = yearOfPublication;
	this.authorName = authorName;
	
}
}
