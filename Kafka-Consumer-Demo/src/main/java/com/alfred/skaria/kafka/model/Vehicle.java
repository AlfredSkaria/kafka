package com.alfred.skaria.kafka.model;

public class Vehicle {

	
	private String vin;
	private String model;
	private String name;
	
	public Vehicle() {}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle(String vin, String model, String name) {
		super();
		this.vin = vin;
		this.model = model;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", model=" + model + ", name=" + name + "]";
	}
		
}
