import junit.framework.TestCase;

/**
 * This is a TestCase that tests a class named Automobile in JUnit 3
 */
public class AutomobileTest extends TestCase {

    public void testContructorAutomobile() {
        new Automobile("Toyota Corolla", 30000, 0, false); 
        new Automobile("Honda Civic", 18000, 25000, true); 
        new Automobile("Ford Mustang", 40000, 0, false); 
    }
}
