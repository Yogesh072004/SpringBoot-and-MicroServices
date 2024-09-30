package com.yp.comp;

public class Employee {
	//all are mandatory to participate
       private int eno;
       private String ename;
       private float billamt;
	       
       public Employee(int eno,String ename,float billamt) {
    	   this.eno=eno;
    	   this.ename=ename;
    	   this.billamt=billamt;
       }

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", billamt=" + billamt + "]";
	}
       
}
