/**
 * 
 */

/**
 * Excercise1.7
 * This is a class implemented WeatherRecord and this class contains
 * 5 attribute : d, today, normal, record, precipitation
 */
public class WeatherRecord {
       private Date d;
       private TemperatureRange today;
       private TemperatureRange normal;
       private TemperatureRange record;
       private double precipitation;
       /**
        * 
        * @param date         The date of the weather record.
        * @param today        The temperature range for today.
        * @param normal       The normal temperature range.
        * @param record       The record temperature range.
        * @param precipitation The amount of precipitation.
        * Ex:
          + new WeatherRecord(new Date(15,7,2000), new TemperatureRange(29,32),new TemperatureRange(28,31),new TemperatureRange(33,40), 10);
		  + new WeatherRecord(new Date(25,12,2021), new TemperatureRange(28,33),new TemperatureRange(30,31),new TemperatureRange(37,40), 0);
		  + new WeatherRecord(new Date(5,3,2030), new TemperatureRange(30,33),new TemperatureRange(30,31),new TemperatureRange(35,42), 7);
        */
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
       
       
}
