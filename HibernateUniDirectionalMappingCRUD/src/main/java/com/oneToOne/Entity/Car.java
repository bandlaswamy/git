package com.oneToOne.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private String car_Id;
	
	private String car_Name;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="engine_Id")
	private Engine engine;

	public String getCar_Id() {
		return car_Id;
	}

	public void setCar_Id(String car_Id) {
		this.car_Id = car_Id;
	}

	public String getCar_Name() {
		return car_Name;
	}

	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [car_Id=" + car_Id + ", car_Name=" + car_Name + ", price=" + price + ", engine=" + engine + "]";
	}
	
	

	
	
	
}
