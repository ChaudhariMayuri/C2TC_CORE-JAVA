package com.tns.framework;


public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBa, boolean isSalary);
	
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBa, float creditLimit);
     
	
	
	
}

