package com.sanjib.test;

import java.util.List;

public class Address {
	
	private String addrsLine1;
	
	private String addrsLine2;
	
	private String pincode;
	
	private String city;
	
	private String state;

	public Address(String addrsLine1, String addrsLine2, String pincode, String city, String state) {
		super();
		this.addrsLine1 = addrsLine1;
		this.addrsLine2 = addrsLine2;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addrsLine1=" + addrsLine1 + ", addrsLine2=" + addrsLine2 + ", pincode=" + pincode + ", city="
				+ city + ", state=" + state + "]";
	};
	
	
	
	
	


	
	
	
	
}