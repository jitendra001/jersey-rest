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

import com.blog.model.Comment;
import com.blog.service.CommentService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {
	
	CommentService commentService = new CommentService();

	@GET
	public List<Comment> getComments(){
		return commentService.getComments();
	}
	
	@GET
	@Path("{commentId}")
	public Comment getComment(@PathParam("commentId") int id){
		return commentService.getComment(id);
	}
	
	@POST
	public Comment addComment(Comment comment){
		return commentService.addComment(comment);
	}
	
	@PUT
	@Path("{commentId}")
	public Comment updateComment(@PathParam("commentId") int id, Comment comment){
		comment.setId(id);
		return commentService.updateComment(comment);
	}
	
	@DELETE
	@Path("{commentId}")
	public void deleteComment(@PathParam("commentId") int id){
		commentService.deleteComment(id);
	}
}
