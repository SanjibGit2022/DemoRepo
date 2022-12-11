package com.sanjib.test;

import java.util.Date;

public class Employee {
	
	private String fName;
	private String lName;
	private String gender;
	private Integer age;
	private String dob;
	
	private Address address;
	
	

	public Employee(String fName, String lName, String gender, Integer age, String dob, Address address) {
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", age=" + age + ", dob=" + dob
				+ ", address=" + address + "]";
	}
	
	
	

}
