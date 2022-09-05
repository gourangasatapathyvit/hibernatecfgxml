package com.hibernatetut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int num;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

}
