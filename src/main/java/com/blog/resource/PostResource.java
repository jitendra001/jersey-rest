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

import com.blog.model.Post;
import com.blog.service.PostService;

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {
	
	@Autowired
	PostService postService;
	
	@GET
	public List<Post> getPosts(){
		return postService.getPosts();
	}
	
	@GET
	@Path("/{postId}")
	public Post getPost(@PathParam ("postId") int id){
		return postService.getPost(id);
	}
	
	@POST
	public Post addPost(Post post){
		return postService.addPost(post);
	}
	
	@PUT
	@Path("/{postId}")
	public Post updatePost(@PathParam ("postId") int id, Post post){
		post.setId(id);
		return postService.updatePost(post);
	}
	
	@DELETE
	@Path("/{postId}")
	public void deletePost(@PathParam ("postId") int id){
		postService.deletePost(id);
	}
	
	@Path("{postId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}

	@Path("{postId}/tags")
	public TagResource getTagResource(){
		return new TagResource();
	}
	@Path("{postId}/likes")
	public LikeResource getLikeResource(){
		return new LikeResource();
	}
}
