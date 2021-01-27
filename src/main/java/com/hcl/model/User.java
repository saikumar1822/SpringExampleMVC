package com.hcl.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	private int userid;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String username;
	@NotEmpty
	@Size(min = 1, max = 20)
	private String password;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String firstname;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String lastname;
	@NotEmpty
	@Size(min = 1, max = 50)
	@Email
	private String email;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String address;
	@NotEmpty
	@Size(min = 1, max = 50)
	private String phone;
	
	
	
	public User(int userid, String username, String password, String firstname, String lastname, String email,
			String address, String phone) {
		super();
	this.userid=userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
