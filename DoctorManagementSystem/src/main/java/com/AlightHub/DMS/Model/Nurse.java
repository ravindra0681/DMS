package com.AlightHub.DMS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nurse {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int nurseid;
private String name;
private String address;
private String genader;
private int mobileno;
private String email;
private String department;


public int getNurseid() {
	return nurseid;
}
public void setNurseid(int nurseid) {
	this.nurseid = nurseid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGenader() {
	return genader;
}
public void setGenader(String genader) {
	this.genader = genader;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
