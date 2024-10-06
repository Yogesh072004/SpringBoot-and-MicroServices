package com.yp.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class Wish {

 @Autowired	//Field level injection
 @Qualifier("dt1")
 private Date date;
 
 @Autowired	//Field level injection
 @Qualifier("dt2")
 public void setDate(Date date) {
	 System.out.println(".setDate()");
	 this.date=date;
 }
 @Autowired	//Field level injection
 @Qualifier("dt3")
 public void assugn(Date date) {
	 System.out.println(".setassign()");
 }
 
@Autowired
 public Wish(@Qualifier("dt4") Date date) {
	 System.out.println("Wish-0-param");
	 this.date=date;
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
