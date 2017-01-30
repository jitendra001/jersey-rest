package com.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.blog.db.DBClass;
import com.blog.model.Author;

public class AuthorService {

	private Map<Integer, Author> authors = DBClass.getAuthors();

	public List<Author> getAuthors() {
		return new ArrayList<>(authors.values());
	}

	public Author getAuthor(int id) {
		return authors.get(id);
	}

	public Author addAuthor(Author author) {
		return authors.put(author.getId(), author);
	}
	
	public Author updateAuthor(Author author){
		return authors.put(author.getId(), author);
	}
	
	public void deleteAuthor(int id){
		authors.remove(id);
	}

}
