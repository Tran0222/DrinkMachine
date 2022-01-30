/* Student Name: Jennifer Tran
 * Lab Professor: Mohammed Patoary
 * Due Date: November 19,2021
 * Description: The DrinkMachine class will hold the variables related to the drink sizes/ volumes and calculations of the measured quality control
 */

/* These are the instance variables*/
public class DrinkMachine {
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	public static final double EPSILON = 10.0; // quality control measured volume within 10ml of expected volume?
	private double volume; // (ml)
	private String size; // "small", "medium", "large"
	
	/* This is the constructor with no args*/ 
	public DrinkMachine() {
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
	}
	
	 /* This is a constructor with args*/ 
	public DrinkMachine(double volume, String size) {
		this.volume = volume;
		this.size = size;
	}

	//get method volume
	public double getVolume() {
		return volume;
	}

	//set method volume
	public void setVolume(double volume) {
		this.volume = volume;
	}

	//get method size
	public String getSize() {
		return size;
	}

	//set method size
	public void setSize(String size) {
		this.size = size;
	}

	 /* */ 
	public String verifySize() {
		String report = "";
		double difference = 0;
		double smallDiff = Math.abs(SMALL_VOLUME -volume);
		double mediumDiff = Math.abs(MEDIUM_VOLUME - volume);
		double largeDiff = Math.abs(LARGE_VOLUME - volume);
		
		switch(size) {
			case SMALL:
				if (smallDiff > EPSILON ) {
					report = String.format(
							"size is %s, volume is %.1f ml, difference is %.1f ml, outside of tolerance of 10.0 ml",
							DrinkMachine.SMALL,volume,smallDiff);
				}
				else if (smallDiff < EPSILON ){
						report = String.format(
								"size is %s, volume is %.1f ml, difference is %.1f ml, within tolerance of 10.0 ml",
								DrinkMachine.SMALL,volume,smallDiff);		
				}
				break;
				
			case MEDIUM:
				if (mediumDiff > EPSILON ) {
					report = String.format(
							"size is %s, volume is %.1f ml, difference is %.1f ml, outside of tolerance of 10.0 ml",
							DrinkMachine.MEDIUM,volume,mediumDiff);
				}
				else if ( mediumDiff < EPSILON){
						report = String.format(
								"size is %s, volume is %.1f ml, difference is %.1f ml, within tolerance of 10.0 ml",
								DrinkMachine.MEDIUM,volume,mediumDiff);		
				}
				break;
				
			case LARGE:
				if (largeDiff > EPSILON ) {
					report = String.format(
							"size is %s, volume is %.1f ml, difference is %.1f ml, outside of tolerance of 10.0 ml",
							DrinkMachine.LARGE,volume,largeDiff);
				}
				else if (largeDiff < EPSILON){
						report = String.format(
								"size is %s, volume is %.1f ml, difference is %.1f ml, within tolerance of 10.0 ml",
								DrinkMachine.LARGE,volume,largeDiff);		
				}
				break;
				
				default: 
					report = String.format(
							"size is %s, volume is %.1f ml, difference is %.1f ml, invalid size or volume",size,volume,difference);
				break;
				}
				return report ;
			}
		
	 /* This method calls for the drinkSizeMenu() */ 
	public String drinkSizeMenu() {
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME,
				DrinkMachine.MEDIUM, DrinkMachine.MEDIUM_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.LARGE_VOLUME
				);
		return report;
	}

}
