package com.manyToMany.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {

	@Id
	private int id;
	
	private String name;
	private int age;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List <Subjects> subjects;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + ", subjects=" + subjects + "]";
	}

	
	
	
}
