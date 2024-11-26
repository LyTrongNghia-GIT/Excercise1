/**
 * 
 */

/**
 * Excercise1.8
 * This is a class implemented a Train and this class contains
 * 3 attribute: schedule, route, islocal
 */
public class Train {
     private Schedule schedule;
     private Route route;
     private boolean islocal;
     /**
      * 
     * @param schedule The schedule of the train.
     * @param route    The route of the train.
     * @param isLocal  Whether the train is a local train.
     * Ex:
       + new Train(new Schedule(new ClockTime(18, 30), new ClockTime(19, 0)), new Route("City A", "City B"), true)
       + new Train(new Schedule(new ClockTime(9, 45), new ClockTime(12, 30)), new Route("City X", "City Y"), false)
       + new Train(new Schedule(new ClockTime(22, 15), new ClockTime(23, 45)), new Route("Station A", "Station B"), true)
     */
	public Train(Schedule schedule, Route route, boolean islocal) {
		this.schedule = schedule;
		this.route = route;
		this.islocal = islocal;
	}
}
