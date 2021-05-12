package com.example.servlet;
public class Registration {
	private String firstname;
	private String lastname;
	private String contactUs;
	private String address;
	public Registration(String firstname, String lastname, String contactUs, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactUs = contactUs;
		this.address = address;
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
	public String getContactUs() {
		return contactUs;
	}
	public void setContactUs(String contactUs) {
		this.contactUs = contactUs;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
