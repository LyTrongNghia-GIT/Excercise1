/**
 * 
 */

/**
 * Excercise1.6
 * This is a class implemented a BookStoreAssistant and this class contains
 * 4 attribute : title, price, yearOfPublication, author
 */
public class BookStoreAssistant {
    private String title;
    private double price;
    private int yearOfPublication;
    private Author author;
    /**
     * 
     * @param title the title of the book
     * @param price the price of the book
     * @param yearOfPublication the year the book was published
     * @param author the author of the book
     * Ex:
       + new BookStoreAssistant("To Kill a Mockingbird", 18.99, 1960, new Author("Harper Lee", 1926));
       + new BookStoreAssistant("1984", 15.50, 1949, new Author("George Orwell", 1903));
       + new BookStoreAssistant("Pride and Prejudice", 12.99, 1813, new Author("Jane Austen", 1775));

     */
	public BookStoreAssistant(String title, double price, int yearOfPublication, Author author) {
		this.title = title;
		this.price = price;
		this.yearOfPublication = yearOfPublication;
		this.author = author;
	}
    
}
