package com.ba.SpingBootDataJPAdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "users")

public class User {
	@Id
	private String u_name;
	private String password;
	private String first_name;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getU_name() {
		return u_name;
	}
	public void setUsername(String u_name) {
		this.u_name = u_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + u_name + ", password=" + password + "first name="+first_name+ "]";
	}
	

}
