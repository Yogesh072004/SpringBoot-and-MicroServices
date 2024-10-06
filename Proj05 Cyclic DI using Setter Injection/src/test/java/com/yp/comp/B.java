package com.yp.comp;

public class B {
   private A a;
   public B(A a) {
	   this.a=a;
	   System.out.println("B::0::PARAM");
	   
   }

@Override
public String toString() {
	return "B [a=]";
}
  
}
