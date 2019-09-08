package com.AlightHub.DMS.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @author Admin
 
 *
 */
@Entity
public class Login {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int loginid;
private String uname;
private String password;
public int getLoginid() {
	return loginid;
}
public void setLoginid(int loginid) {
	this.loginid = loginid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



public static void m1()
{
	String s=Constant.LOGIN_ID;
}



}
