package com.yp.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yp.beans.Wish;


public class SpringBeanScopeTest2 {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("com/yp/cfgs/applicationContext.xml");
		Wish wish=factory.getBean("wish",Wish.class);
		Wish wish1=factory.getBean("wish",Wish.class);
	    System.out.println(wish.hashCode()+"<====>"+wish1.hashCode());
	    if(wish.hashCode()==wish1.hashCode()) {
	    	System.out.println("only one object is created for both refrences");
	    }else {
	    	System.out.println("Different objects are created");
	    }
	    
	    System.out.println(wish1.generateMsg("Yogesh"));
	    System.out.println("spring beans count::"+factory.getBeanDefinitionCount());
	    System.out.println("Bean ids::"+Arrays.toString(factory.getBeanDefinitionNames()));
	   	    
	}

}
