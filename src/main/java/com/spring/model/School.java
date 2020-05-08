package com.spring.model;

public class School {

	private int id;
	private String name;
	private String location;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "*** School Details ***\n Id= " + id +"\n " + "Name= " + name + "\n Location= " + location + "\n ";
	}
}