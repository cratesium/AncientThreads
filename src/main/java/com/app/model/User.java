package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	
	
	
	  @Id
		private Integer id;
	private String userName;

	private String firstName;
	private String lastNameS;
	private String middleName;
	private String eMail;
	private String contact;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNameS() {
		return lastNameS;
	}
	public void setLastNameS(String lastNameS) {
		this.lastNameS = lastNameS;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", firstName=" + firstName + ", lastNameS=" + lastNameS + ", middleName="
				+ middleName + ", userName=" + userName + ", eMail=" + eMail + ", contact=" + contact + "]";
	}
	public User(Integer id, String firstName, String lastNameS, String middleName, String userName, String eMail,
			String contact) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNameS = lastNameS;
		this.middleName = middleName;
		this.userName = userName;
		this.eMail = eMail;
		this.contact = contact;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
