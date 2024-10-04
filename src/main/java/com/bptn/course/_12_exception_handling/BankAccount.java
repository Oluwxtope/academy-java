package com.bptn.course._12_exception_handling;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class BankAccount {
	
	private double accountBalance;
	
	public BankAccount(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amountToWithdraw) throws InsufficientBalanceException {
		if (accountBalance >= amountToWithdraw) {
			this.accountBalance -= amountToWithdraw;
		} else {
			throw new InsufficientBalanceException("Insufficienct funds!");
		}
	}
	
	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000.00);
		try {
			myAccount.withdraw(1500);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
