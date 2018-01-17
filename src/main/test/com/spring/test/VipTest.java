package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clover.spring.bean.Vip;

public class VipTest {
	
	@Test
	public void userNameTest(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Vip vip = (Vip) context.getBean("vip");
		vip.isBlank("clover");
		System.out.println(vip.getCode());
		
		System.out.println("=======================================");
		vip.printMessage();
		
		vip.sayHi();
	}
}