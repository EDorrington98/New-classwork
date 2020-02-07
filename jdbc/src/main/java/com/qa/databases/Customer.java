package com.qa.databases;

public class Customer {
	private Long id;
	String firstName;
	String surname;

	
		// TODO Auto-generated constructor stub
	

	public Customer(Long id, String firstName, String surname) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
