package com.star.sud.batchprocessing.bean;

public class Person {

	private String lastName;
	private String firstName;

	// Constructors
	/////////////////
	public Person() {
		super();
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + "]";
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
