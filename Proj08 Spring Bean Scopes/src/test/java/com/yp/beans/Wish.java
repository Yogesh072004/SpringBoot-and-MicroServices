package com.yp.beans;

import java.util.Date;

public class Wish {
 private Date date;
 public Wish() {
	 System.out.println("Wish-0-param");
 }
public void setDate(Date date) {
	this.date = date;
}
 public String generateMsg(String user) {
	 System.out.println("wish.generateMsg");
	 int hour=date.getHours();
	 if(hour<12) {
		 return "Good Morning:"+user;
	 }else if(hour<16) {
		 return "Good AfterNoon:"+user;
	 }else if(hour<20) {
		 return "Good Evening:"+user;
	 }else {
		 return "Good Night:"+user;
	 }
 }
}
