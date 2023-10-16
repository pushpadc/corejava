package com.cg.mmbankapp.application;

import com.cg.mmbankapp.framework.BankFactory;
import com.cg.mmbankapp.framework.CurrentAcc;
import com.cg.mmbankapp.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}
	
}


