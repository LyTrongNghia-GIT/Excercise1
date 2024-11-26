import junit.framework.TestCase;

/**
 * This is a TestCase that tests a class named Book in JUnit 3
 */
public class BookTest extends TestCase {

    public void testContructorBook() {
        new Book("Daniel Defoe", 15.5, 1719, "Robinson Crusoe");
        new Book("Joseph Conrad", 12.8, 1902, "Heart of Darkness");
        new Book("Pat Conroy", 9.5, 1996, "Beach Music");
    }

}
