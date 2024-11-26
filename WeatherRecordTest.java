import junit.framework.TestCase;

/**
 * This is a TestCase that tests classes named TemperatureRange, Date, and WeatherRecord in JUnit 3
 */
public class WeatherRecordTest extends TestCase {

    /**
     * This is a TestCase that tests the constructor of the TemperatureRange class
     */
    public void testContructorTemperatureRange() {
        new TemperatureRange(23, 24);
        new TemperatureRange(0, 1);
        new TemperatureRange(0, 7);
    }

    /**
     * This is a TestCase that tests the constructor of the Date class
     */
    public void testContructorDate() {
        new Date(20, 2, 2002);
        new Date(5, 8, 2006);
        new Date(14, 11, 2005);
    }

    /**
     * This is a TestCase that tests the constructor of the WeatherRecord class
     */
    public void testContructorWeatherRecord() {
        new WeatherRecord(new Date(15, 7, 2000), new TemperatureRange(29, 32), new TemperatureRange(28, 31), new TemperatureRange(33, 40), 10);
        new WeatherRecord(new Date(25, 12, 2021), new TemperatureRange(28, 33), new TemperatureRange(30, 31), new TemperatureRange(37, 40), 0);
        new WeatherRecord(new Date(5, 3, 2030), new TemperatureRange(30, 33), new TemperatureRange(30, 31), new TemperatureRange(35, 42), 7);
    }
}
