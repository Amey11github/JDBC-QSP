package com.jsp.personpassportcrudunimap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	int passnum;
	int dob;
	String address;
	@OneToOne  //to establish connection between 2 tables ... one to one - uni directional mapping
	Person person;
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(int passnum, int dob, String address, Person person) {
		super();
		this.passnum = passnum;
		this.dob = dob;
		this.address = address;
		this.person = person;
	}

	public int getPassnum() {
		return passnum;
	}

	public void setPassnum(int passnum) {
		this.passnum = passnum;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
