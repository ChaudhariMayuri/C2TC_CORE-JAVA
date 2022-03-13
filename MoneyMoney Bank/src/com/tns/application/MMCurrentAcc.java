package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBa, float creditLimit) {
		super(accNo, accNm, accBa, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit) {
		System.out.println("Dearcurrent acc user your withdraw charges are :"+accBa+"with creditlimit is :" +creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	


}
