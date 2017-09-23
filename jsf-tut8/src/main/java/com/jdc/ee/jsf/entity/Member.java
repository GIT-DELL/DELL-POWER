package com.jdc.ee.jsf.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Member implements Serializable {
	
	public enum Interest {
		JavaSE, JavaEE, Web, Android
	}
	
	private String name;
	private String email;
	private String phone;
	
	private Interest interest;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(Interest interest) {
		this.interest = interest;
	}

}
