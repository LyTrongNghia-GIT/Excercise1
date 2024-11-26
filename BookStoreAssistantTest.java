import junit.framework.TestCase;

/**
 * This is a TestCase that tests classes named Author and BookStoreAssistant in JUnit 3
 */
public class BookStoreAssistantTest extends TestCase {

    public void testContructorAuthor() {
        new Author("Harper Lee", 1926);
        new Author("George Orwell", 1903);
        new Author("Jane Austen", 1775);
    }

    /**
     * This is TestCase that tests a class named BookStoreAssistant
     */
    public void testContructorBookStoreAssistant() {
        new BookStoreAssistant("To Kill a Mockingbird", 18.99, 1960, new Author("Harper Lee", 1926));
        new BookStoreAssistant("1984", 15.50, 1949, new Author("George Orwell", 1903));
        new BookStoreAssistant("Pride and Prejudice", 12.99, 1813, new Author("Jane Austen", 1775));
    }
}
