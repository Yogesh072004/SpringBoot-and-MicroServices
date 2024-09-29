package com.yp.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.yp.comp.Flipkart;

public class Client {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/yp/cfgs/applicationContext.xml");
		
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		String resultmsg=fpkt.Shopping(new String[] {"shirt", "trousers","glasses"},new float[] { 3.2f,87.f,985.2f});
		System.out.println(resultmsg);

	}

}
