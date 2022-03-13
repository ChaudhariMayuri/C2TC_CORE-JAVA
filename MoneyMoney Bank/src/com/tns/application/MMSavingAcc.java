package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accNm, float accBa, boolean isSalary) {
		super(accNo, accNm, accBa, isSalary);
		
	}

	private static final float MINBAL = 5;
	
	
	
	public void withdraw(float accBa) {
	System.out.println("dear saving acc user , your withdraw charge are : "+accBa);
		
	}

    @Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public float creditLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
