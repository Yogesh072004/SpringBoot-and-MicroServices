package com.yp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.yp.comp.A;
import com.yp.comp.B;

public class Client {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/yp/cfgs/applicationContext.xml");
		A oa=factory.getBean("a1",A.class);
		System.out.println(oa);
		B b=factory.getBean("b1",B.class);
		System.out.println(b);
		
	}

}
