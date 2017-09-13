package exercise02;

import java.util.ArrayList;
import java.util.Date;

public class Account {

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12 / 100;
	}
	
	public double getMonthlyInterest() {
		
		return balance * getMonthlyInterestRate();
	}
	
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		if (amount >0) {
			balance += amount;
		}
		
	}
	
	private int id;    					//getter and setter needed
	private double balance;   			//getter and setter needed
	private double annualInterestRate;	//getter and setter needed
	private Date dateCreated = new Date(); 	//getter
	private String name;				//getter and setter
	private ArrayList<Transaction> transactions = new ArrayList<>();  //getter
	
	public Account() {
		
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	
	public Account(int id, double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	

	
	
	
	
}
