package com.xworkz.functionalinterface.runner;

import com.xworkz.functionalinterface.Starter;
import com.xworkz.functionalinterface.use.Labour;

public class StarterRunner {
	
	public static void main(String[]args) {
		
		Starter starter=()->{
			System.out.println("running lambda expression");
		};
		Labour labour=new Labour(starter);
	}

}
