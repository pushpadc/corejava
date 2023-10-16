package com.cg.mmbankapp.application;

import com.cg.mmbankapp.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		System.out.println("Account balance in the Current Account: "+getAccBal()+" with the creditlimit is: "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}
