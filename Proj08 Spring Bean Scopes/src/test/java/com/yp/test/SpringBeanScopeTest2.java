package com.yp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.yp.beans.Wish;
import com.yp.ston.Printer;

public class SpringBeanScopeTest2 {

	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/yp/cfgs/applicationContext2.xml");
		Wish wish=factory.getBean("wish",Wish.class);
		Wish wish1=factory.getBean("wish",Wish.class);
	    System.out.println(wish.hashCode()+"<====>"+wish1.hashCode());
	    if(wish.hashCode()==wish1.hashCode()) {
	    	System.out.println("only one object is created for both refrences");
	    }else {
	    	System.out.println("Different objects are created");
	    }
	    
	    
		
	    Printer p1=factory.getBean("p",Printer.class);
	    Printer p2=factory.getBean("p",Printer.class);
	    System.out.println(p1.hashCode()+"<=====>"+p2.hashCode());
	    Printer p3=factory.getBean("p1",Printer.class);
	    System.out.println(p1.hashCode()+"<=====>"+p3.hashCode());
	    
	    
	    
	}

}
