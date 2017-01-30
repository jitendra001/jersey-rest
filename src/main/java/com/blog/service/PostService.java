package com.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.blog.db.DBClass;
import com.blog.model.Post;

@Service("postService")
public class PostService {

	private static Map<Integer, Post> posts = DBClass.getPosts();

	public List<Post> getPosts() {
		return new ArrayList<>(posts.values());
	}

	public Post getPost(int id) {
		return posts.get(id);
	}

	public Post addPost(Post post) {
		post.setId(posts.size() + 1);
		posts.put(post.getId(), post);
		return post;
	}

	public Post updatePost(Post post) {

		if (post.getId() <= 0) {
			return null;
		}
		return posts.put(post.getId(), post);
	}

	public void deletePost(int id) {
		posts.remove(id);
	}
}
