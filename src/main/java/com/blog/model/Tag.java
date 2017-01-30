package com.blog.model;

public class Tag {
	
	private int id;
	private String name;
	
	public Tag(){
		
	}
	public Tag(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
}
