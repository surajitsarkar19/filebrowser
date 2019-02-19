package com.srs.filebrowser.model;

public class Employee {
	private String id;
	private String lastName;
	private String firstName;
	
	public Employee() {}
 
	public Employee(String id, String firstName, String lastName) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}
 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
