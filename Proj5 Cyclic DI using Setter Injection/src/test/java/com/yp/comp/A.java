package com.yp.comp;

public class A {
   private B b;
   public A(B b) {
	   this.b=b;
	   System.out.println("A::0::PARAM");
	   
   }

@Override
public String toString() {
	return "A [b]";
}
  
}
