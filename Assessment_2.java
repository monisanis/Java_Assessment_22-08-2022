package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Assessment_2 {
@Id
private int cid;
private String cname;
private String caddress;
private long cnumber;
private String cloginid;
private String cpassword;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}
public long getCnumber() {
	return cnumber;
}
public void setCnumber(long cnumber) {
	this.cnumber = cnumber;
}
public String getCloginid() {
	return cloginid;
}
public void setCloginid(String cloginid) {
	this.cloginid = cloginid;
}
public String getPassword() {
	return cpassword;
}
public void setPassword(String cpassword) {
	this.cpassword = cpassword;
}
@Override
public String toString() {
	
	return "Assessment_2[cid="+cid+",cname="+cname+",caddress="+caddress+",cnumber="+cnumber+",cloginid="+cloginid+",cpassword="+cpassword+"]";
	
}

}
