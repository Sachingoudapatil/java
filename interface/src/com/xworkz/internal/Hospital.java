package com.xworkz.internal;

public class Hospital implements HospitalRule {

	@Override
	public boolean keepClean() {
		// TODO Auto-generated method stub
		System.out.println("running keepclean in hospital");
		return false;
	}

	@Override
	public boolean noSmoking() {
		// TODO Auto-generated method stub
		System.out.println("running noSmoking in hospital");
		return false;
	}

	@Override
	public boolean registration() {
		// TODO Auto-generated method stub
		System.out.println("running registration in hospital");
		return false;
	}

}
