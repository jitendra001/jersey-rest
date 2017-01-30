package com.blog.model;

import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private int id;
	private String content;
	private Author author;
	private List<Comment> comments = new ArrayList<>();
	private List<Tag> tags = new ArrayList<>();
	private List<Like> likes = new ArrayList<>();
	
	public Post(){
		
	}
	
	public Post(Author author, String content) {
		super();		
		this.author = author;
		this.content = content;
	}

	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	
}
