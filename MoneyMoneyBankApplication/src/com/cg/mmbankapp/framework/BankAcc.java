package com.cg.mmbankapp.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	
	public BankAcc(int AccNo, String accNm, float accBal) {
		super();
		this.accNo=AccNo;
		this.accNm= accNm;
		this.accBal=accBal;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
		System.out.println("Withdraw amount is: "+accBal);
	}
	public void deposite(float accBal) {
		System.out.println("Deposited amount is: "+accBal);
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
}
