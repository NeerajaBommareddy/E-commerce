package com.project.craftycommerce.user;

public class User {
	private int user_id;
	private String first_name;
	private String last_name;
	private String role;
	private String password;
	private String email;
	private String contact_number;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int user_id, String first_name, String last_name, String role, String password, String email,
			String contact_number) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
		this.password = password;
		this.email = email;
		this.contact_number = contact_number;
		
	}

	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
}
