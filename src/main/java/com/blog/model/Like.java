package com.blog.model;

public class Like {

	private int id;
	private int postId;
	private User user;
	
	public Like(){
		
	}
	public Like(int id, int postId, User user) {
		super();
		this.id = id;
		this.postId = postId;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPostId() {
		return postId;
	}
	public User getUser() {
		return user;
	}
	
	
}
