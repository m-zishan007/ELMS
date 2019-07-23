package com.elms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity(name="leaveType")
@Table(name="leave_type")
public class LeaveType implements Serializable{

	private static final long serialVersionUID = 9108692961387671938L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="leave_type", length = 200)
	private String leaveType;
	
	@Lob
	@Column(name= "description")
	private String description;
	
	@Column(name= "creation_date")
	private Date creationDate;
	
	public LeaveType() {
		
	}

	public LeaveType(int id, String leaveType, String description, Date creationDate) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.description = description;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
