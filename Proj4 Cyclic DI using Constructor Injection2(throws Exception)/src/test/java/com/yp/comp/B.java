package com.yp.comp;

public class B {
   private A a;
   public B() {
	   System.out.println("B::0::PARAM");
   }
public void setA(A a) {
	System.out.println("B.setA()");
	this.a = a;
	
}
@Override
public String toString() {
	return "B [a=]";
}
  
}
