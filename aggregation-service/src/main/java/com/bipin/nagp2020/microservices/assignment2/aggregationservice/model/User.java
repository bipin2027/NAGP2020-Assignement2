package com.bipin.nagp2020.microservices.assignment2.aggregationservice.model;

public class User {
	private String name;
	private int age;
	private String email;
	private int uId;

	public User() {

	}

	public User(String name, int age, String email, int uId) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.uId = uId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

}
