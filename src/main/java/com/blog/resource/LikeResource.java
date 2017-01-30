package com.blog.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.blog.model.Like;
import com.blog.service.LikeService;
public class LikeResource {
	
	LikeService likeService = new LikeService();
	
	@GET
	public List<Like> getLikes(){
		return likeService.getLikes();
	}
	
	@GET
	@Path("{likeId}")
	public Like getLike(@PathParam("likeId") int id){
		return likeService.getLike(id);
	}
	
	@POST
	Like addLike(Like like){
		return likeService.addLike(like);
	}
	
	@DELETE
	@Path("{likeId}")
	public void deleteLike(@PathParam("likeId") int id){
		likeService.deleteLike(id);
	}

}
