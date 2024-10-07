package com.xworkz.functionalinterface.use;

import com.xworkz.functionalinterface.FoodApp;
import com.xworkz.functionalinterface.Starter;

public class Labour {
	
	public Labour(Starter s) {

		if(s!=null) {
			s.on();
		}
		else {
			System.out.println("null");
		}
		
		public void orderfood(FoodApp foodapp) {
			foodapp.order("idli");
		}
	}
}
