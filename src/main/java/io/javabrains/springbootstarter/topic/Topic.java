package io.javabrains.springbootstarter.topic;

public class Topic {
	
	private String id;
	private String name;
	private String description;
	private int noOfStudents;
	private String className;
	
	public Topic() {
	}
	
	public Topic(String id, String name, String description, int noOfStudents, String className) {
		super();
		this.id = id;
		this.name = name;
		this.noOfStudents=noOfStudents;
		this.className=className;
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
	public String getClassName() {
		return className;
	}
	public int getStudents() {
		return noOfStudents;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
