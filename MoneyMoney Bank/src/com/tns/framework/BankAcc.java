package com.tns.framework;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	protected float accBa;
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccNm() {
		return accNm ;
	}
	
	public void setAccNm(String accNm) {
		this.accNm = accNm ;
	}
	
	public float getaccBa() {
		return accBa ;
	}
	
	public void setaccBa(float accBa) {
		this.accBa = accBa;
	}
	
	
	
	public BankAcc(int accNo, String accNm, float accBa) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBa = accBa;
	}

	public void withdraw(float accBa) {
		System.out.println("withdral charged are:" +accBa);
	}
	
	public void deposite(float  accBa) {
		System.out.println("deposit with charges:" +accBa);
	}
	

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBa=" + accBa + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
