package com.elms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="department")
@Table(name="departments")
public class Department implements Serializable{

	private static final long serialVersionUID = 6035136288839028556L;

	@Id
	@Column(name="id", length = 11)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="department_name", length = 150)
	private String departmentName;
	
	@Column(name="department_short_name", length = 100)
	private String departmentShortName;
	
	@Column(name="department_code", length = 50)
	private String departmentCode;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	public Department() {
		
	}

	public Department(int id, String departmentName, String departmentShortName, String departmentCode,
			Date creationDate) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentShortName = departmentShortName;
		this.departmentCode = departmentCode;
		this.creationDate = creationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentShortName() {
		return departmentShortName;
	}

	public void setDepartmentShortName(String departmentShortName) {
		this.departmentShortName = departmentShortName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
