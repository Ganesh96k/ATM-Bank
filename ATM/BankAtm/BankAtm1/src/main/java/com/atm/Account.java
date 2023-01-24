package com.atm;

import java.util.Date;
import org.springframework.lang.NonNull;


public class Account {
	@NonNull
	private int id;           //created id for uniq
	private int password;     
	private String Name;
	@NonNull
	private Double Balance;
	private Date transationDate;
	//private boolean isDone;
	
	public Account(int id, int password, String name, Double balance, Date transationDate/* , boolean isDone */) {
		super();
		this.id = id;
		this.password = password;
		Name = name;
		Balance = balance;
		this.transationDate = transationDate;
		//this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

	public Date getTransationDate() {
		return transationDate;
	}

	public void setTransationDate(Date transationDate) {
		this.transationDate = transationDate;
	}

	/*
	 * public boolean isDone() { return isDone; }
	 * 
	 * public void setDone(boolean isDone) { this.isDone = isDone; }
	 */

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", Name=" + Name + ", Balance=" + Balance
				+ ", transationDate=" + transationDate  /*+", isDone=" + isDone + "]"*/;
	}
}
