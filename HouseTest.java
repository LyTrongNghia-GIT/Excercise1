import junit.framework.TestCase;

/**
 * This is TestCase that tests a class named Address and House in JUnit 3
 */
public class HouseTest extends TestCase {

    /**
     * This is TestCase that tests a class named Address
     */
    public void testContructorAddress() {
        new Address(23, "Maple Street", "Brookline");
        new Address(5, "Joye Road", "Newton");
        new Address(83, "Winslow Road", "Waltham");
    }

    /**
     * This is TestCase that tests a class named House
     */
    public void testContructorHouse() {
        new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
        new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
        new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
    }
}
