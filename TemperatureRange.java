/**
 * 
 */

/**
 * Excercise1.7
 * This is a class implemented TemperatureRange and this class contains
 * 2 attribute : low, high
 */

public class TemperatureRange {
    private int low;
    private int high;
    /**
     * 
     * @param low  The low temperature value.
     * @param high The high temperature value.
     * Ex:
       + new TemperatureRange(23, 24);
       + new TemperatureRange(0, 1);
       + new TemperatureRange(0, 7);
     */
	public TemperatureRange(int low, int high) {
		this.low = low;
		this.high = high;
	}
    
}
