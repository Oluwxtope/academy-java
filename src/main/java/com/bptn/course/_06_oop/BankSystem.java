package com.bptn.course._06_oop;

public class BankSystem {

	public static void main (String[] args) {
		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo();
		
		SavingsAccount testSavingsAccount = new SavingsAccount("987654", 1200.00, 5.00);
		testSavingsAccount.applyInterestRate();
		testSavingsAccount.displayAccountInfo();
	}
	

}

