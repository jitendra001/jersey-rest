package com.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.blog.db.DBClass;
import com.blog.model.Comment;
@Service("commentService")
public class CommentService {

	private Map<Integer, Comment> comments = DBClass.getComments();

	public List<Comment> getComments() {
		return new ArrayList<>(comments.values());
	}

	public Comment getComment(int id) {
		return comments.get(id);
	}

	public Comment addComment(Comment comment) {
		comment.setId(comments.size() + 1);
		return comments.put(comment.getId(), comment);
	}

	public Comment updateComment(Comment comment) {
		return comments.put(comment.getId(), comment);
	}

	public void deleteComment(int id) {
		comments.remove(id);

	}

}
