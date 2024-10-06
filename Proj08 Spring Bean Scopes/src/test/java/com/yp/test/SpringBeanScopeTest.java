package com.yp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yp.beans.Wish;
import com.yp.ston.Printer;

public class SpringBeanScopeTest {

	
	public static void main(String[] args) {
		DefaultListableBeanFactory ctx=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(ctx);
		reader.loadBeanDefinitions("com/yp/cfgs/applicationContext.xml");
		Wish wish=ctx.getBean("wish",Wish.class);
		Wish wish1=ctx.getBean("wish",Wish.class);
	    System.out.println(wish.hashCode()+"<====>"+wish1.hashCode());
	    if(wish.hashCode()==wish1.hashCode()) {
	    	System.out.println("only one object is created for both refrences");
	    }else {
	    	System.out.println("Different objects are created");
	    }
	    
	    
		Wish wish2=ctx.getBean("wish1",Wish.class);
	    System.out.println(wish2.hashCode()+"<====>"+wish.hashCode());
	    if(wish2.hashCode()==wish.hashCode()) {
	    	System.out.println("only one object is created for both refrences");
	    }else {
	    	System.out.println("Different objects are created");
	    }
	    Printer p1=ctx.getBean("p",Printer.class);
	    Printer p2=ctx.getBean("p",Printer.class);
	    System.out.println(p1.hashCode()+"<=====>"+p2.hashCode());
	    Printer p3=ctx.getBean("p1",Printer.class);
	    System.out.println(p1.hashCode()+"<=====>"+p3.hashCode());
	    
	    
	    
	}

}
