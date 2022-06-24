package com.example.collegeadm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pgdetails")
public class Studentpg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 45)
	private String fname;
	@Column(nullable = false, length = 60)
	private String lname;
	@Column(nullable = false, length = 60)
	private String fathername;
	@Column(nullable = false, length = 60)
	private String mothername;
	@Column(nullable = false, length = 60)
	private String gender;
	@Column(nullable = false, length = 60)
	private String dob;
	@Column(nullable = false, length = 60)
	private String hname;
	@Column(nullable = false, length = 60)
	private String street;
	@Column(nullable = false, length = 60)
	private String district;
	@Column(nullable = false, length = 60)
	private String state;
	@Column(nullable = false, length = 60)
	private String mobileno;
	@Column(nullable = false, length = 60)
	private String sslcboard;
	@Column(nullable = false, length = 60)
	private String sslcmarks;
	@Column(nullable = false, length = 60)
	private String sslcyear;
	@Column(nullable = false, length = 60)
	private String hsboard;
	@Column(nullable = false, length = 60)
	private String hsmarks;
	@Column(nullable = false, length = 60)
	private String hsyear;
	
	@Column(nullable = false, length = 60)
	private String ugboard;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getSslcboard() {
		return sslcboard;
	}
	public void setSslcboard(String sslcboard) {
		this.sslcboard = sslcboard;
	}
	public String getSslcmarks() {
		return sslcmarks;
	}
	public void setSslcmarks(String sslcmarks) {
		this.sslcmarks = sslcmarks;
	}
	public String getSslcyear() {
		return sslcyear;
	}
	public void setSslcyear(String sslcyear) {
		this.sslcyear = sslcyear;
	}
	public String getHsboard() {
		return hsboard;
	}
	public void setHsboard(String hsboard) {
		this.hsboard = hsboard;
	}
	public String getHsmarks() {
		return hsmarks;
	}
	public void setHsmarks(String hsmarks) {
		this.hsmarks = hsmarks;
	}
	public String getHsyear() {
		return hsyear;
	}
	public void setHsyear(String hsyear) {
		this.hsyear = hsyear;
	}
	public String getUgboard() {
		return ugboard;
	}
	public void setUgboard(String ugboard) {
		this.ugboard = ugboard;
	}
	public String getUgmarks() {
		return ugmarks;
	}
	public void setUgmarks(String ugmarks) {
		this.ugmarks = ugmarks;
	}
	public String getUgyear() {
		return ugyear;
	}
	public void setUgyear(String ugyear) {
		this.ugyear = ugyear;
	}
	public String getPgcourse() {
		return pgcourse;
	}
	public void setPgcourse(String pgcourse) {
		this.pgcourse = pgcourse;
	}
	@Column(nullable = false, length = 60)
	private String ugmarks;
	@Column(nullable = false, length = 60)
	private String ugyear;
	@Column(nullable = false, length = 60)
	private String pgcourse;

}
