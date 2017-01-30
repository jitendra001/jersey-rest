package com.blog.model;

public class Comment {
	
	private int id;
	private int postId;
	private String comment;
	private User user;
	
	public Comment(){
		
	}
	public Comment(int id, int postId, String comment, User user) {
		super();
		this.id = id;
		this.postId = postId;
		this.comment = comment;
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
	public String getComment() {
		return comment;
	}
	public User getUser() {
		return user;
	}
	
}
