
/**
 * Excercise1.4
 * This is a class implemented a Book and this class contains 3 attribute:
  + hours, minutes, seconds.
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds; 
    /**
     * Constructor for the Time cla
     * @param hours The number of hours (0-2ss.
     *3).
     * @param minutes The number of minutes (0-59).
     * @param seconds The number of seconds (0-59).
     * Ex: 
      + new Time(8, 30, 59); {8h:30m:59s}
      + new Time(9, 10, 29); {9h:10m:29s}
      + new Time(23, 30, 50); {23h:30m:50s}
     */
	public Time(int hours, int minutes, int seconds) {
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
    
}
