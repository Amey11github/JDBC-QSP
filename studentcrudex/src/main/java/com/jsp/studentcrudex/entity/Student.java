package com.jsp.studentcrudex.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	int id;
	String name;
	String address;
	int sclass;
	double percent;
	
	 public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String address, int sclass, double percent) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sclass = sclass;
		this.percent = percent;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSclass() {
		return sclass;
	}

	public void setSclass(int sclass) {
		this.sclass = sclass;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", sclass=" + sclass + ", percent="
				+ percent + "]";
	}
	 
	 

}
