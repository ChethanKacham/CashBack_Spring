package com.wipro;

public class Customer {
	private String customerId;
	private String Password;
	private double Balance;
	public Customer() {
		super();
	}
	public Customer(String customerId, String password, double balance) {
		super();
		this.customerId = customerId;
		Password = password;
		Balance = balance;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	

}
