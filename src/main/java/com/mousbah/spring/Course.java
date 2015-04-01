package com.mousbah.spring;

public class Course {
	
	private String desription;
	private long id;
	private String name;

	public Course() {
	}

	public Course(String name, String desription, long id) {
		super();
		this.name = name;
		this.desription = desription;
		this.id = id;
	}

	public String getDesription() {
		return desription;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
