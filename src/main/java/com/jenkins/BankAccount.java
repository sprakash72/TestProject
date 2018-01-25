package com.jenkins;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double debit(double amount) {
		if (balance < amount) {
			amount = balance;
		}

		balance -= amount;
		return amount;
	}

}
