package com.dub;

public class Person {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("constructor");
	}
	
	public Person() {
		System.out.println("default constructor");
	}
	
	
	{
		this.lastName = "Dean";
		System.out.println("initialization");
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	
}
