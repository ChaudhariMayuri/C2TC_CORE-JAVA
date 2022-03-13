package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalary;
	private static final float MINBAL = 0;
	
	
	public SavingAcc(int accNo, String accNm, float accBa, boolean isSalary) {
		super(accNo, accNm, accBa);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBa) {
		System.out.println("charges are:" +accBa);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public abstract float creditLimit();

	
	
	}


