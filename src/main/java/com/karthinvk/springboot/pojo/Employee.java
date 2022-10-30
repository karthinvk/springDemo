package com.karthinvk.springboot.pojo;

public class Employee {
	
	private String name;
	private String firstName;
	private String latsName;
	
	public Employee(String name, String firstName, String latsName) {
		this.name = name;
		this.firstName = firstName;
		this.latsName = latsName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLatsName() {
		return latsName;
	}
	public void setLatsName(String latsName) {
		this.latsName = latsName;
	}

	

}
