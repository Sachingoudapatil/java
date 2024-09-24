package com.xworkz.internal;

public class CricketRunner {
	public static void main(String[] args) {
		CricketRule cricketRule=new KACricketRule();
		BCCI bcci=new BCCI();
		bcci.setCricketRule(cricketRule);
		bcci.check();
	}

}
