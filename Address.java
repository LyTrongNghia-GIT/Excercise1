/**
 * 
 */

/**
 * Excercise1.5 
 * This is a class implemented a House and this class contains
 * 3 attribute : housenumber, streetname, city
 */
public class Address {
      private int housenumber;
      private String streetname;
      private String city;
      /**
       * 
       * @param housenumber The house number in the address
       * @param streetname The name of the street in the address
       * @param city The city of the address
       * Ex:
        + new Address(23, "Maple Street", "Brookline");
    	+ new Address(5, "Joye Road", "Newton");
    	+ new Address(83, "Winslow Road", "Waltham");
       */
	public Address(int housenumber, String streetname, String city) {
		
		this.housenumber = housenumber;
		this.streetname = streetname;
		this.city = city;
	}
      
}
