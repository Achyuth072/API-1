package com.ba.LoginApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
	private int uid;
	private String first_name;
	private String last_name;
	private String password;
	private String username;
	private String email;

	public int getUid() {
		return uid;
	}

	public void setU_id(int uid) {
		this.uid = uid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", first_name=" + first_name + ", last_name=" + last_name + ", password="
				+ password + ", username=" + username + "email=" + email +"]";
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
