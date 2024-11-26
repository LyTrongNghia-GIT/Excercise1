/**
 * Excercise1.7
 * This is a class implemented Date and this class contains
 * 3 attribute : day, month, year
 */
public class Date {
    private int day;
    private int month;
    private int year;
    /**
     * 
     * @param day   The day of the month.
     * @param month The month of the year.
     * @param year  The year.
     * Ex:
      + new Date(20, 2, 2002);
      + new Date(5,8,2006);
      + new Date(14,11,2005);
     */
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
    
}
