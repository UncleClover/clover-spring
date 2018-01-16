package com.spring.test;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.alibaba.fastjson.JSON;
import com.clover.spring.vo.Message;
import com.clover.spring.vo.Tips;

public class MessageTest {

	@Test
	public void test() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(JSON.toJSONString(context));
		Message message = (Message) context.getBean("message");
		message.getMessage1();;
		
//		Message message1 = (Message) context.getBean("message");
//		message1.getMessage1();
		
		Tips tips = (Tips) context.getBean("tips");
		tips.getTip1();
		tips.getTip2();
		tips.getMessage1();
		tips.getMessage2();
		
		context.registerShutdownHook();
	}
	
//	@Test
	public void BeanFactoryTest() {
		Resource res = new ClassPathResource("applicationContext.xml");
		
		// xmlbeanfactory已经过时
		// new XmlBeanFactory(res);
		
		// xmlbeanfactory替换方式
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);

		Message message = (Message) factory.getBean("message");
		message.getMessage1();
	}
}
