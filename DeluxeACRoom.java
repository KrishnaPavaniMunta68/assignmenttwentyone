package teammatch;

class DeluxeACRoom extends DeluxeRoom{
	private int ratePerSqFeet;

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
	
	int rate = this.calculateTariff();
	
	
}
