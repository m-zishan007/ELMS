package com.elms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="admin")
@Table(name="admin")
public class Admin implements Serializable{

	private static final long serialVersionUID = -6017060938036860602L;

	@Id
	@Column(name="id", length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="user_name", length = 100)
	private String userName;
	
	@Column(name="password", length = 100)
	private String password;
	
	@Column(name="updation_date")
	private Date updationDate;

	public Admin() {
		
	}
	public Admin(int id, String userName, String password, Date updationDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.updationDate = updationDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(Date updationDate) {
		this.updationDate = updationDate;
	}
	
	
}
