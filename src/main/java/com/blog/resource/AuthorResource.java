package com.blog.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.blog.model.Author;
import com.blog.service.AuthorService;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorResource {
	
	@Autowired
	AuthorService authorService;
	
	@GET
	public List<Author> getAuthors(){
		return authorService.getAuthors();
	}
	
	@GET
	@Path("/{authorId}")
	public Author getAuthor(@PathParam("authorId") int id){
		return authorService.getAuthor(id);
	}
	
	@POST
	public Author addAuthor(Author author){
		return authorService.addAuthor(author);
	}
	
	@PUT
	@Path("/{authorId}")
	public Author updateAuthor(@PathParam("authorId") int id, Author author){
		author.setId(id);
		return authorService.updateAuthor(author);
	}
	
	@DELETE
	@Path("/{authorId}")
	public void deleteAuthor(@PathParam("authorId") int id){
		authorService.deleteAuthor(id);
	}

}
