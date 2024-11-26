/**
 * Excercise1.5 
 * This is a class implemented a House and this class contains
 * 4 attribute : kind, numberOfRoom, price, Address 
 */
public class House {
     private String kind;
     private int numberOfRoom;
     private double price;
     private Address address;
     /**
      * 
      * @param kind Is the type of house
      * @param numberOfRoom The number of rooms in the house
      * @param price The price of the house
      * @param address The address of the house
      * Ex:
       + new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
       + new House("Colonial", 9 , 450000, new Address(5, "Joye Road", "Newton"));
       + new House("Cape", 6 , 235000, new Address(83, "Winslow Road", "Waltham"));
      */
	public House(String kind, int numberOfRoom, double price, Address address) {
		this.kind = kind;
		this.numberOfRoom = numberOfRoom;
		this.price = price;
		this.address = address;
	}
}
