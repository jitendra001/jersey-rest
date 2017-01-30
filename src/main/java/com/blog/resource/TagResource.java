package com.blog.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.blog.model.Tag;
import com.blog.service.TagService;
public class TagResource {

	TagService tagService = new TagService();

	@GET
	public List<Tag> getTags() {
		return tagService.getTags();
	}

	@GET
	@Path("{tagId}")
	public Tag getTag(@PathParam("tagId") int id) {
		return tagService.getTag(id);
	}

	@POST
	public Tag addTag(Tag tag) {
		return tagService.addTag(tag);
	}

	@PUT
	@Path("{tagId}")
	public Tag updateTag(@PathParam("tagId") int id, Tag tag) {
		tag.setId(id);
		return tagService.updateTag(tag);
	}

	@DELETE
	@Path("{tagId}")
	public void deleteTag(@PathParam("tagId") int id) {
		tagService.deleteTag(id);
	}

}
