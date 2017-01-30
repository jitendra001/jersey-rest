package com.blog.model;

public class Author {

	private int id;
	private String firstName;
	private String lastName;
	
	public Author(){
		
	}
	public Author(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
}
