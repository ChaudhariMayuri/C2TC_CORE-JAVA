package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.BankAcc;

public class client {

	public static void main(String[] args) {
		
		BankFactory BF = new MMBankFactory();
		SavingAcc SA = new MMSavingAcc(123,"mayuri",200,true);
		SA. withdraw(SA.getaccBa());
		SA.toString();
		CurrentAcc CA = new MMCurrentAcc(246,"mayu",200,50);
		CA.withdraw(SA.creditLimit());
		CA.toString();
		
		

	}

}
