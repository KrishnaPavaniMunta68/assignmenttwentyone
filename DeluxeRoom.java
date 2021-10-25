package teammatch;

	class DeluxeRoom extends HotelRoom{
		
		//protected attributes of DeluxeRoom class
		private int ratePerSqFeet;
		
		
		//Constructor which gives a default value of 10 to the variable ratePerSqFeet
		public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
			super(hotelName, numberOfSqFeet, hasTV, hasWifi);
			ratePerSqFeet = 10;
			
			}
		//getRatePerSqFeet
		public int getRatePerSqFeet() {
//			returns (ratePerSqFeet + 2) if Wifi is present, else returns ratePerSqFeet./
			if (this.isHasWifi()) {
				return this.ratePerSqFeet+2;
			}
			else {
				return this.ratePerSqFeet; 		//WHY MY VARIABLE ratePerSqFeet IS NOT STOING GIVEN VALUE THAT IS 10 IN LINE NO. 74??? PLEASE HELP;
			}
			
		}
		
		int rate = this.calculateTariff();
		
		
	}


