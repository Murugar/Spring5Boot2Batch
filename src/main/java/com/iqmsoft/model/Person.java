package com.iqmsoft.model;

public class Person {
	public Person() {
	}
	
	private String name;
	private String surname;
	private String job;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Person(String name, String surname, String job) {
		this.name = name;
		this.surname = surname;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name + " Surname: " + surname + " Job: " + job;
	}
	
}
