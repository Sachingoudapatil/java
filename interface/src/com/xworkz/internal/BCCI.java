package com.xworkz.internal;

public class BCCI {
	
	private CricketRule CricketRule;
	
	public void setCricketRule(CricketRule CricketRule) {
	 this.CricketRule = CricketRule;
	 
	}
	
	public void check() {
		System.out.println("running is in a check");
		if (CricketRule != null) {
			System.out.println("cricket rule is not null");
			CricketRule.powerPlay();
			
		}
		else {
			System.out.println("cricket rule is null");
		}
	}
	

}
