package com.example.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Candiate_Profile_Recruitment")
@EntityListeners(AuditingEntityListener.class)
public class RecruitmentBean {
	@Id
	@GeneratedValue
	private Long id;
	private String clientName;
	private String noPosition;
	private String stack;
	private String expReq;
	private String jobDesc;
	private String location;
	private Date date;
	
	
	public RecruitmentBean() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getNoPosition() {
		return noPosition;
	}

	public void setNoPosition(String noPosition) {
		this.noPosition = noPosition;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public String getExpReq() {
		return expReq;
	}

	public void setExpReq(String expReq) {
		this.expReq = expReq;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "RecruitmentBean [id=" + id + ", clientName=" + clientName + ", noPosition=" + noPosition + ", stack="
				+ stack + ", expReq=" + expReq + ", jobDesc=" + jobDesc + ", location=" + location + ", date=" + date
				+ "]";
	}

	
}
