package com.example.model;

public class Device {
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Device(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
