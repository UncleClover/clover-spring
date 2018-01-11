package com.spring.test;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.alibaba.fastjson.JSON;
import com.clover.spring.vo.Message;

public class MessageTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(JSON.toJSONString(context));
		Message message = (Message) context.getBean("message");
		message.getMessage();
	}
	
	@Test
	public void BeanFactoryTest() {
		Resource res = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);

		Message message = (Message) factory.getBean("message");
		message.getMessage();
	}
}
