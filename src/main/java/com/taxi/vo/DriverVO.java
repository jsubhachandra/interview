package com.taxi.vo;

public class DriverVO {
	private String email;
	private String name;
	private String uname;
	private String phone;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "DriverVO [email=" + email + ", name=" + name + ", uname=" + uname + ", phone=" + phone + "]";
	}
	
	
	
}
