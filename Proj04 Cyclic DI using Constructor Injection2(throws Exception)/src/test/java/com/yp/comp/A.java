package com.yp.comp;

public class A {
   private B b;
   public A() {
	   System.out.println("A::0::PARAM");
   }
public void setB(B b) {
	System.out.println("A.setB()");
	this.b = b;
	
}
@Override
public String toString() {
	return "A [b=]";
}
  
}
