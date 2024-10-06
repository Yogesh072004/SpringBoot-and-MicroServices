package com.yp.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Wish {

 @Autowired	//Field level injection
 @Qualifier("da")
 private Date date;
 public Wish() {
	 System.out.println("Wish-0-param");
 }

 public String generateMsg(String user) {
	 System.out.println("wish.generateMsg"+date);
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
