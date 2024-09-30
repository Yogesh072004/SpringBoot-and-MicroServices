package com.yp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.yp.comp.Employee;
import com.yp.comp.Student;

public class Client {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new  XmlBeanDefinitionReader (factory);
		reader.loadBeanDefinitions("com/yp/cfgs/applicationContext.xml");
		Employee e=factory.getBean("emp",Employee.class);
		System.out.println(e);
		Student s=factory.getBean("stu",Student.class);
		System.out.println(s);
		
	}

}
