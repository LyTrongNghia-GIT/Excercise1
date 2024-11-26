/**
 * 
 */

/**
 * Excercise1.3
 * This is a class implemented a Automobile and this class contains
 * 4 attribute: model, price,  mileage, used
 */
public class Automobile {
     private String model;
     private int price;
     private double mileage;
     private boolean used;
     /**
      * 
     * @param model The model of the automobile (e.g., "Toyota Corolla").
      * @param price The price of the automobile (in dollars).
      * @param mileage The mileage of the automobile (in miles per gallon or kilometers per liter).
      * @param used Whether the automobile is used (true if used, false if new).
      * Ex:
      * - new Automobile("Toyota Corolla", 30000, 0, false); 
      * - new Automobile("Honda Civic", 18000, 25000, true); 
      * - new Automobile("Ford Mustang", 40000, 0, false); 

      */
	public Automobile(String model, int price, double mileage, boolean used) {
		this.model = model;
		this.price = price;
		this.mileage = mileage;
		this.used = used;
	}
     
}
