package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Candiate_Profile")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String cname;
	private String email;
	private String cctc;
	private String ectc;
	private String gender;
	private String currentOrg;
	private Date date;
	private String totalExp;
	private String releventExp;
	private String noticePeriod;
	private String stack;
	private String location;
	private String contactNo;
	private String relocate;
	private String interviewPannel;


	public String getEctc() {
		return ectc;
	}



	public void setEctc(String ectc) {
		this.ectc = ectc;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCctc() {
		return cctc;
	}



	public void setCctc(String cctc) {
		this.cctc = cctc;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCurrentOrg() {
		return currentOrg;
	}



	public void setCurrentOrg(String currentOrg) {
		this.currentOrg = currentOrg;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public String getTotalExp() {
		return totalExp;
	}



	public void setTotalExp(String totalExp) {
		this.totalExp = totalExp;
	}



	public String getReleventExp() {
		return releventExp;
	}



	public void setReleventExp(String releventExp) {
		this.releventExp = releventExp;
	}



	public String getNoticePeriod() {
		return noticePeriod;
	}



	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}



	public String getStack() {
		return stack;
	}



	public void setStack(String stack) {
		this.stack = stack;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getContactNo() {
		return contactNo;
	}



	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	public String getRelocate() {
		return relocate;
	}



	public void setRelocate(String relocate) {
		this.relocate = relocate;
	}



	public String getInterviewPannel() {
		return interviewPannel;
	}



	public void setInterviewPannel(String interviewPannel) {
		this.interviewPannel = interviewPannel;
	}



	public Employee() {
		super();
	}
	


}
