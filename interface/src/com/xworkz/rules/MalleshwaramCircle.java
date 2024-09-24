package com.xworkz.rules;

public class MalleshwaramCircle {
	private TrafficRules rules;

	public MalleshwaramCircle(TrafficRules rules) {
		super();
		this.rules = rules;
	}
	public void use() {
		if(rules !=null) {
		String result=	rules.licenceNo();	
		if(result !=null) {
			System.out.println("license no valid :  "+result);
		}
		else
			System.out.println("licence no not valid");
		
		}
	}
}
