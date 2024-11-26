import junit.framework.TestCase;

/**
 * This is a TestCase that tests a class named Time in JUnit 3
 */
public class TimeTest extends TestCase {

    public void testContructorTime() {
        new Time(8, 30, 59);
        new Time(9, 10, 29);
        new Time(23, 30, 50);
    }
}
