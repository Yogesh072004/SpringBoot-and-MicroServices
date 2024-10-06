package com.yp.vo;

public class EmployeeVO {
	private  String eno;
    private  String ename;
    private String desg;
    private  float basicSalary;
     //alt+shift+s ,r
       public String getEno() {
               return eno;
       }
       public void setEno(String eno) {
               this.eno = eno;
       }
       public String getEname() {
               return ename;
       }
       public void setEname(String ename) {
               this.ename = ename;
       }
       public String getDesg() {
               return desg;
       }
       public void setDesg(String desg) {
               this.desg = desg;
       }
       public float getBasicSalary() {
               return basicSalary;
       }
       public void setBasicSalary(float basicSalary) {
               this.basicSalary = basicSalary;
       }
}
