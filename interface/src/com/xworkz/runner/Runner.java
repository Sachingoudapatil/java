package com.xworkz.runner;

import com.xworkz.internal.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeRule collegeRule=new College();
		collegeRule.attendance();
		collegeRule.avoidNoice();
		collegeRule.exams();
		collegeRule.noAlcohol();
		collegeRule.noSmoking();
		collegeRule.parking();
		collegeRule.ragging();
		collegeRule.stayInTime();
		collegeRule.uniform();
		collegeRule.wearId();
		
		RailwayStationRule railwayStationRule=new Railway();
		railwayStationRule.accessibilityStandards();
		railwayStationRule.boardingStation();
		railwayStationRule.checking();
		railwayStationRule.emergencyProcedures();
		railwayStationRule.journeyExtention();
		railwayStationRule.keepClean();
		railwayStationRule.loudSound();
		railwayStationRule.luggage();
		railwayStationRule.operationalProcedures();
		railwayStationRule.platform();
		railwayStationRule.queueing();
		railwayStationRule.safetyRegulations();
		railwayStationRule.sleeperClass();
		railwayStationRule.ticket();
		railwayStationRule.waitingList();
		
		HospitalRule hospitalRule=new Hospital();
		hospitalRule.keepClean();
		hospitalRule.noSmoking();
		hospitalRule.registration();
		
       
		TrafficRule trafficRule=new Traffic();
		trafficRule.checkBlindSpots();
		trafficRule.dl();
		trafficRule.drinkAndDrive();
		trafficRule.insurance();
		trafficRule.noMobilePhoneUse();
		trafficRule.numberPlate();
		trafficRule.obeyLaneMarkings();
		trafficRule.obeyTrafficSignals();
		trafficRule.overSpeeding();
		trafficRule.respectNoParkingZones();
		trafficRule.useIndicator();
		trafficRule.wareHelmet();
		trafficRule.wareSeatBelt();
		trafficRule.yieldToEmergencyVehicles();
		
		TempleRule rule=new Temple();
		rule.appropriateAttire();
		rule.followInstructions();
		rule.maintainCleanliness();
		rule.maintainSilence();
		rule.noPets();
		rule.noPhotography();
		rule.noSmoking();
		rule.removeShoes();
		rule.respectServiceTimes();
		rule.respectWorshippers();

		BankRule bankRule=new Bank();
		bankRule.antiMoneyLaunderingCompliance();
		bankRule.atmUsageLimit();
		bankRule.chequeClearanceTime();
		bankRule.confidentiality();
		bankRule.customerServiceStandards();
		bankRule.depositInsurance();
		bankRule.loanEligibilityCriteria();
		bankRule.minimumBalance();
		bankRule.noOverdrafts();
		bankRule.openingHours();
		bankRule.secureOnlineBanking();
		bankRule.silence();
		bankRule.timelyLoanRepayments();
		bankRule.transactionFee();
		bankRule.validIDRequired();


		

	}

}
