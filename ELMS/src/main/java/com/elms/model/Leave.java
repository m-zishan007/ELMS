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

@Entity(name="leave")
@Table(name="leaves")
public class Leave implements Serializable{

	private static final long serialVersionUID = 1668423832359133040L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="leave_type", length=110)
	private String leaveType;
	
	@Column(name= "to_date", length = 120)
	private String toDate;
	
	@Column(name="from_date", length = 120)
	private String fromDate;
	
	@Lob
	@Column(name="descriptiion")
	private String description;
	
	@Column(name="posting_date")
	private Date postingDate;
	
	@Lob
	@Column(name= "admin_remark")
	private String adminRemark;
	
	@Column(name= "admin_remark_date", length = 120)
	private String adminRemarkDate;
	
	@Column(name="status", length = 1)
	private int status;
	
	@Column(name="is_read", length = 1)
	private int isRead;
	
	@Column(name="emp_id", length = 11)
	private int empid;
	
	public Leave() {
		
	}

	public Leave(int id, String leaveType, String toDate, String fromDate, String description, Date postingDate,
			String adminRemark, String adminRemarkDate, int status, int isRead, int empid) {
		super();
		this.id = id;
		this.leaveType = leaveType;
		this.toDate = toDate;
		this.fromDate = fromDate;
		this.description = description;
		this.postingDate = postingDate;
		this.adminRemark = adminRemark;
		this.adminRemarkDate = adminRemarkDate;
		this.status = status;
		this.isRead = isRead;
		this.empid = empid;
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

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public String getAdminRemark() {
		return adminRemark;
	}

	public void setAdminRemark(String adminRemark) {
		this.adminRemark = adminRemark;
	}

	public String getAdminRemarkDate() {
		return adminRemarkDate;
	}

	public void setAdminRemarkDate(String adminRemarkDate) {
		this.adminRemarkDate = adminRemarkDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIsRead() {
		return isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
