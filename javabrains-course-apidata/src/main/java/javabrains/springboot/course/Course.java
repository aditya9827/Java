package javabrains.springboot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javabrains.springboot.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Topic topic;

	public Course() {

	}

	public Course(String description, String id, String name, int topicId) {
		super();
		this.description = description;
		this.id = id;
		this.name = name;
		this.topic = new Topic("", topicId, "");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
