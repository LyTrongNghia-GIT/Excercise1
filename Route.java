/**
 * 
 */

/**
 * Excercise1.8
 * This is a class implemented a Route and this class contains
 * 2 attribute: origin, destination
 */
public class Route {
    private String origin;
    private String destination;
    /**
     * 
     * @param origin      The origin of the route.
     * @param destination The destination of the route.
     * Ex:
       + new Route("City A", "City B");
       + new Route("City X", "City Y");
       + new Route("Station A", "Station B");
     */
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
    
}
