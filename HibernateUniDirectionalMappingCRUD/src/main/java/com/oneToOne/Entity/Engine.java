package com.oneToOne.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {

	@Id
	private String engine_Id;

	private String engine_Type;
	private long cc;

	public String getEngine_Id() {
		return engine_Id;
	}

	public void setEngine_Id(String engine_Id) {
		this.engine_Id = engine_Id;
	}

	public String getEngine_Type() {
		return engine_Type;
	}

	public void setEngine_Type(String engine_Type) {
		this.engine_Type = engine_Type;
	}

	public long getCc() {
		return cc;
	}

	public void setCc(long cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [engine_Id=" + engine_Id + ", engine_Type=" + engine_Type + ", cc=" + cc + "]";
	}

	
}
