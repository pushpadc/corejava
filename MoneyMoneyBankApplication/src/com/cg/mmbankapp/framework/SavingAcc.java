package com.cg.mmbankapp.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL= 100f;
	
	
	public SavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal);
		this.isSalaried=isSalaried;
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal) {
		System.out.println("withdraw amount in the Saving Account is: "+accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}

	
	

}
