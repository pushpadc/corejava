package com.cg.mmbankapp.application;

import com.cg.mmbankapp.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL= 100f;
	
	public MMSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		super(AccNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal) {
		System.out.println("Account balance in the Saving Account is: "+ accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
