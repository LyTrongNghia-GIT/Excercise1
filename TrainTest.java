import junit.framework.TestCase;

/**
 * This is a TestCase that tests classes named Route, Schedule, ClockTime, and Train in JUnit 3
 */
public class TrainTest extends TestCase {

    /**
     * This is a TestCase that tests the constructor of the Route class
     */
    public void testContructorRoute() {
        new Route("City A", "City B");
        new Route("City X", "City Y");
        new Route("Station A", "Station B");
    }

    /**
     * This is a TestCase that tests the constructor of the Schedule class
     */
    public void testContructorSchedule() {
        new Schedule(new ClockTime(18, 30), new ClockTime(19, 0));
        new Schedule(new ClockTime(9, 45), new ClockTime(12, 30));
        new Schedule(new ClockTime(22, 15), new ClockTime(23, 45));
    }

    /**
     * This is a TestCase that tests the constructor of the ClockTime class
     */
    public void testContructorClockTime() {
        new ClockTime(18, 30);
        new ClockTime(9, 45);
        new ClockTime(22, 15);
    }

    /**
     * This is a TestCase that tests the constructor of the Train class
     */
    public void testContructorTrain() {
        new Train(new Schedule(new ClockTime(18, 30), new ClockTime(19, 0)), new Route("City A", "City B"), true);
        new Train(new Schedule(new ClockTime(9, 45), new ClockTime(12, 30)), new Route("City X", "City Y"), false);
        new Train(new Schedule(new ClockTime(22, 15), new ClockTime(23, 45)), new Route("Station A", "Station B"), true);
    }
}
