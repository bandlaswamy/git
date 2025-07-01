package com.oneToMany.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts {

	@Id
	private int acid;
	
	private String acname;
	private double balance;
	
	
	@Override
	public String toString() {
		return "Accounts [acid=" + acid + ", acname=" + acname + ", balance=" + balance + "]";
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
