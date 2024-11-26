import junit.framework.TestCase;

/**
 * This is a TestCase that tests a class named Image in JUnit 3
 */
public class ImageTest extends TestCase {

    public void testContructorImage() {
        new Image(5, 10, "small.gif", "low");
        new Image(120, 200, "med.gif", "low");
        new Image(1200, 1000, "large.gif", "high");
    }

}
