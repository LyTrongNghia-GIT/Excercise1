/**
 * 
 */

/**
 * Excercise1.8
 * This is a class implemented Schedule and this class contains
 * 2 attribute: departure, arrival
 */
public class Schedule {
    private ClockTime departure;
    private ClockTime arrival;
    /**
     * 
     * @param departure The departure time of the schedule.
     * @param arrival   The arrival time of the schedule.
     * Ex:      * 
       + new Schedule(new ClockTime(18, 30), new ClockTime(19, 0));
       + new Schedule(new ClockTime(9, 45), new ClockTime(12, 30));
       + new Schedule(new ClockTime(22, 15), new ClockTime(23, 45));
     */
	public Schedule(ClockTime departure, ClockTime arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}
}
