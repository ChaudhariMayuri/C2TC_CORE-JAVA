package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public  class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBa, boolean isSalary) {
		MMSavingAcc MMsaving = new MMSavingAcc(accNo,accNm,accBa, isSalary);
		return MMsaving ;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBa, float creditLimit) {
		MMCurrentAcc MMcurrent = new MMCurrentAcc(accNo,accNm,creditLimit,creditLimit);
		return MMcurrent ;
		
	}
	
}
	


	
