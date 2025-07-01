package com.manyToMany.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Subjects {

	@Id
	private int sid;
	
	private String sname;
	private int days;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Subjects [sid=" + sid + ", sname=" + sname + ", days=" + days + "]";
	}
	
	
	
}
