package com.project.craftycommerce.address;

public class Address {
	private int address_id;
	private int user_id;
	private String address_line_one;
	private String address_line_two;
	private String city;
	private String state;
	private String country;
	private String pin_code;
	private String type;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int address_id, int user_id, String address_line_one, String address_line_two, String city,
			String state, String country, String pin_code, String type) {
		super();
		this.address_id = address_id;
		this.user_id = user_id;
		this.address_line_one = address_line_one;
		this.address_line_two = address_line_two;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin_code = pin_code;
		this.type = type;
	}

	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAddress_line_one() {
		return address_line_one;
	}
	public void setAddress_line_one(String address_line_one) {
		this.address_line_one = address_line_one;
	}
	public String getAddress_line_two() {
		return address_line_two;
	}
	public void setAddress_line_two(String address_line_two) {
		this.address_line_two = address_line_two;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin_code() {
		return pin_code;
	}
	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
