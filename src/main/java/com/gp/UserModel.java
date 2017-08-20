/**
 * 
 */
package com.gp;

/**
 * @author GANESH
 *
 */
public class UserModel {
	
	private String username;
	private String firstname;
	private String lastname;
	
	public UserModel(String username, String firstname, String lastname) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	

	
}
