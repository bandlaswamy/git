package com.oneToMany.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int bid;
	
	private String bname;
	private String bifsc;

	@OneToMany(cascade=CascadeType.ALL)
	private List <Accounts> accounts;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBifsc() {
		return bifsc;
	}

	public void setBifsc(String bifsc) {
		this.bifsc = bifsc;
	}

	public List<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", bifsc=" + bifsc + ", accounts=" + accounts + "]";
	}
}
