package com.quest.form.model;


public class User {
	
	Integer id;

	String name;
	String ppsn;
	String dateOfBirth;
	String mobilePhoneNumber;
	

	public boolean isNew() {
		return (this.id == null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getPpsn() {
		return ppsn;
	}

	public void setPpsn(String ppsn) {
		this.ppsn = ppsn;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", ppsn=" + ppsn + ", dateOfBirth=" + dateOfBirth
				+ ", mobilePhoneNumber=" + mobilePhoneNumber + "]";
	}

}
