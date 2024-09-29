package com.yp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.yp.beans.Wish;

public class SetterInjectionTest {

    public static void main(String[] args) {
        // Create the Spring IoC container and load the configuration file
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/yp/cfgs/applicationContext.xml");
        Object obj=context.getBean("wmg");
        Wish w=(Wish)obj;

        String result=w.generateMsg("yogesh");
        System.out.println("Wish Message is::"+result);
    }
}
