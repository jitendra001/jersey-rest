package com.blog.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.blog.model.Author;
import com.blog.model.Comment;
import com.blog.model.Like;
import com.blog.model.Post;
import com.blog.model.Tag;
import com.blog.model.User;

public class DBClass {
	
	private static Map<Integer, Post> posts = new HashMap<>();
	private static Map<Integer, Author> authors = new HashMap<>();
	private static Map<Integer, Comment> comments = new HashMap<>();
	private static Map<Integer, Like> Likes = new HashMap<>();
	private static Map<Integer, Tag> tags = new HashMap<>();
	
	static {
		
		Author author1 = new Author(1, "Jitendra", "Shukla");
		List<Tag> tags1 = new ArrayList<Tag>();
		Tag t1 = new Tag(1, "Java");
		tags1.add(t1);
		User user1 = new User(1, "Ashish", "Pant");
		List<Like> like1 = new ArrayList<>();
		Like l1 = new Like(1, 1, user1);
		like1.add(l1);
		List<Comment> comments1 = new ArrayList<>();
		Comment c1 = new Comment(1,1,"Comment 1", user1);
		comments1.add(c1);
		Post post1 = new Post(author1,"This is post 1");
		post1.setComments(comments1);
		post1.setTags(tags1);
		post1.setLikes(like1);
		post1.setId(1);
		
		Author author2 = new Author(2, "Prashant", "Pant");
		List<Tag> tags2 = new ArrayList<Tag>();
		Tag t2 = new Tag(2, "Marketing");
		tags2.add(t2);
		User user2 = new User(2, "Ashok", "Padhi");
		List<Like> like2 = new ArrayList<>();
		Like l2 = new Like(2, 2, user2);
		like2.add(l2);
		List<Comment> comments2 = new ArrayList<>();
		Comment c2 = new Comment(2,2,"Comment 2", user2);
		comments2.add(c2);
		Post post2 = new Post(author2,"This is post 2");
		post2.setComments(comments2);
		post2.setTags(tags2);
		post2.setLikes(like2);
		post2.setId(2);
		
		posts.put(post1.getId(), post1);
		posts.put(post2.getId(), post2);
		
		authors.put(author1.getId(), author1);
		authors.put(author2.getId(), author2);
		
		comments.put(c1.getId(), c1);
		comments.put(c2.getId(), c2);
		
		tags.put(t1.getId(), t1);
		tags.put(t2.getId(), t2);
		
	}
	
	public static Map<Integer, Post> getPosts() {
		return posts;
	}
	public static Map<Integer, Author> getAuthors() {
		return authors;
	}
	public static Map<Integer, Comment> getComments() {
		return comments;
	}
	public static Map<Integer, Like> getLikes() {
		return Likes;
	}
	public static Map<Integer, Tag> getTags() {
		return tags;
	}
	
}
