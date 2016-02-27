package lab3of2classandobject;

import lab3classandobject.AccountType;
import lab3classandobject.Employee;

public class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;	
	
	AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}
	
	//AccountType
	public AccountType getAccountType() {
		return acctType;
	}
	public void setAccountType(AccountType input){
		acctType = input;
	}
	
	//Balance
	public double getBalance(){
		return balance;
	}
	public void setBalance(double input){
		balance = input;
	}

	public void makeDeposit(double deposit) {
		// implement
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement		
		balance -= amount;
		if(balance < 0) return false;
		return true;
	}
}
