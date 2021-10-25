package teammatch;
import java.util.Scanner;

//Created the HotelRoom class 
public class HotelRoom{
	//protected data member
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV;
	private boolean hasWifi;
	
	//constructor to initialize all data members mentioned above
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}	
	
	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}


	/**
	 * @return the numberOfSqFeet
	 */
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	/**
	 * @return the hasTV
	 */
	public boolean isHasTV() {
		return hasTV;
	}

	/**
	 * @return the hasWifi
	 */
	public boolean isHasWifi() {
		return hasWifi;
	}



	//calculateTariff
	public int calculateTariff(){
//		Calculates cost using the number of sq feets and cost per sq feet and returns an Integer. Taking 5000 as cost per sq feet/
		return this.numberOfSqFeet*getRatePerSqFeet(); 
	}
	public int getRatePerSqFeet() {
//		This method returns an Integer. In this case, it always returns 0. Because SqFeet is 0 so multiplication always going to be 0/
		return 0;
	}
}












