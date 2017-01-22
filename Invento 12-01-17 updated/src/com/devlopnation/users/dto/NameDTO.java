package com.devlopnation.users.dto;

public class NameDTO {
	
	private String salutation;
	private String firstName;
	private String middlename;
	private String lastname;
	
	
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "NameDTO [salutation=" + salutation + ", firstName=" + firstName + ", middlename=" + middlename
				+ ", lastname=" + lastname + "]";
	}
	
	
	
}
