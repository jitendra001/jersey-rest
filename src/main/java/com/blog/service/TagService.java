package com.blog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.PathParam;

import org.springframework.stereotype.Component;

import com.blog.db.DBClass;
import com.blog.model.Tag;
@Component
public class TagService {

	private Map<Integer, Tag> tags = DBClass.getTags();

	public List<Tag> getTags() {
		return new ArrayList<>(tags.values());
	}

	public Tag getTag(@PathParam("tagId") int id) {
		return tags.get(id);
	}

	public Tag addTag(Tag tag) {
		tag.setId(tags.size() + 1);
		return tags.put(tag.getId(), tag);
	}

	public Tag updateTag(Tag tag) {
		return tags.put(tag.getId(), tag);
	}

	public void deleteTag(int id) {
		tags.remove(id);
	}

}
