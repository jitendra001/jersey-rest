package com.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.blog.db.DBClass;
import com.blog.model.Like;

public class LikeService {

	private Map<Integer, Like> likes = DBClass.getLikes();

	public List<Like> getLikes() {
		return new ArrayList<>(likes.values());
	}

	public Like addLike(Like like) {
		like.setId(likes.size() + 1);
		return likes.put(like.getId(), like);
	}

	public void deleteLike(int id) {
		likes.remove(id);
	}

	public Like getLike(int id) {
		return likes.get(id);
	}
}
