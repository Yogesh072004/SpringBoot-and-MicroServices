package com.yp.comp;

public class Student {
	//properties are optional to participate
   private String name;
   private int roll;
   private float usn;
public void setName(String name) {
	this.name = name;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public void setUsn(float usn) {
	this.usn = usn;
}
@Override
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", usn=" + usn + "]";
}

   
   
   }
