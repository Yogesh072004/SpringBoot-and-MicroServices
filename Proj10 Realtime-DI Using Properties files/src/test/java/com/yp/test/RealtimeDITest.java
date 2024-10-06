package com.yp.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yp.controller.MainController;
import com.yp.vo.EmployeeVO;

public class RealtimeDITest {

        public static void main(String[] args) {
                //create IOC container
                ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/yp/cfgs/applicationContext.xml");
                MainController controller=ctx.getBean("controller",MainController.class);
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter employee name::");
                String  name=sc.next();
                System.out.println("Enter employee desg::");
                String  desg=sc.next();
                System.out.println("Enter employee basicSalary::");
                float  basicSalary=sc.nextFloat();
                
                EmployeeVO vo=new EmployeeVO();
                vo.setEname(name); vo.setDesg(desg); vo.setBasicSalary(basicSalary);
                //invoke methods
                try {
                        String result=controller.processEmployee(vo);
                        System.out.println(result);
                }
                catch(Exception e) {
                        //e.printStackTrace();
                        System.out.println("Internal problem::"+e.getMessage());
                }
        }
}//class
