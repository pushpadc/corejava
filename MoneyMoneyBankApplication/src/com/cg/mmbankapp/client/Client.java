package com.cg.mmbankapp.client;
import com.cg.mmbankapp.application.MMBankFactory;
import com.cg.mmbankapp.framework.BankFactory;
import com.cg.mmbankapp.application.MMSavingAcc;
import com.cg.mmbankapp.framework.SavingAcc;
import com.cg.mmbankapp.framework.CurrentAcc;
import com.cg.mmbankapp.application.MMCurrentAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1, "Saving Account", 150000, true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new MMCurrentAcc(2,"Current Account", 5000, 85000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
