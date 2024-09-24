package com.xworkz.internal;

public class FoodSafetyDepartment {
	
	HotelRule hotelRule;

	public FoodSafetyDepartment(HotelRule hotelRule) {
		super();
		this.hotelRule = hotelRule;
	}	
		public void inspection() {
			if(hotelRule!=null) {
			hotelRule.cleanPrimises();
			}
			else {
				System.out.println("this is null");
			}
				
		}
	
}

