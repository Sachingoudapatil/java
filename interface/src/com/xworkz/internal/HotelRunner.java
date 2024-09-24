package com.xworkz.internal;

public class HotelRunner {
	
public static void main(String[] args) {
	HotelRule hotelRule=new CanaraHotel();
	FoodSafetyDepartment department=new FoodSafetyDepartment(hotelRule);
	department.inspection();
}

}
