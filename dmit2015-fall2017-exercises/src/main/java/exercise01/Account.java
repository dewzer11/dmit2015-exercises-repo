package exercise01;

import java.util.ArrayList;
import java.util.Date;

import exercise02.Transaction;

public class Account {

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12 / 100;
	}
	
	public double getMonthlyInterest() {
		
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount, String description) {
		if (amount > 0) {
			balance -= amount;
			Transaction currentTransaction = new Transaction('W', amount,balance, description);
			transactions.add(currentTransaction);
			
		}
	}
	
	public void deposit(double amount, String description) {
		if (amount >0) {
			balance += amount;
			Transaction currentTransaction = new Transaction('D', amount, balance, description);
			transactions.add(currentTransaction);
		}
		
	}
	
	private int id;    					//getter and setter needed
	private double balance;   			//getter and setter needed
	private double annualInterestRate;	//getter and setter needed
	private Date dateCreated = new Date(); 	//getter
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Account() {
		
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
}
