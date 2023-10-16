package com.cg.mmbankapp.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;
	

	public CurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal);
		this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}
	

	public float getCreditLimit() {
		return creditLimit;
	}


	public void withdraw(float creditLimit) {
		System.out.println("The credit amount limit is: "+creditLimit);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
}
