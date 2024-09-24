package com.xworkz.internal;

public class Bank implements BankRule {

	@Override
	public boolean silence() {
		// TODO Auto-generated method stub
		System.out.println("running silence in bank");
		return false;
	}

	@Override
	public String openingHours() {
		// TODO Auto-generated method stub
		System.out.println("running openingHours in bank");
		return null;
	}

	@Override
	public double minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("running minimumBalance in bank");
		return 0;
	}

	@Override
	public boolean noOverdrafts() {
		// TODO Auto-generated method stub
		System.out.println("running noOverdrafts in bank");

		return false;
	}

	@Override
	public boolean validIDRequired() {
		// TODO Auto-generated method stub
		System.out.println("running validIDRequired in bank");

		return false;
	}

	@Override
	public boolean secureOnlineBanking() {
		// TODO Auto-generated method stub
		System.out.println("running secureOnlineBanking in bank");

		return false;
	}

	@Override
	public double atmUsageLimit() {
		// TODO Auto-generated method stub
		System.out.println("running atmUsageLimit in bank");

		return 0;
	}

	@Override
	public double transactionFee() {
		// TODO Auto-generated method stub
		System.out.println("running transactionFee in bank");

		return 0;
	}

	@Override
	public boolean loanEligibilityCriteria() {
		// TODO Auto-generated method stub
		System.out.println("running loanEligibilityCriteria in bank");

		return false;
	}

	@Override
	public boolean confidentiality() {
		// TODO Auto-generated method stub
		System.out.println("running confidentiality in bank");

		return false;
	}

	@Override
	public boolean antiMoneyLaunderingCompliance() {
		// TODO Auto-generated method stub
		System.out.println("running antiMoneyLaunderingCompliance in bank");

		return false;
	}

	@Override
	public boolean depositInsurance() {
		// TODO Auto-generated method stub
		System.out.println("running depositInsurance in bank");

		return false;
	}

	@Override
	public boolean timelyLoanRepayments() {
		// TODO Auto-generated method stub
		System.out.println("running timelyLoanRepayments in bank");

		return false;
	}

	@Override
	public boolean accountStatementAvailability() {
		// TODO Auto-generated method stub
		System.out.println("running accountStatementAvailability in bank");

		return false;
	}

	@Override
	public int chequeClearanceTime() {
		// TODO Auto-generated method stub
		System.out.println("running chequeClearanceTime in bank");

		return 0;
	}

	@Override
	public boolean customerServiceStandards() {
		// TODO Auto-generated method stub
		System.out.println("running customerServiceStandards in bank");

		return false;
	}

}
