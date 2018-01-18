package com.spring.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clover.spring.aop.inter.IOperServiceSV;

public class IOperServiceSVTest {

	@SuppressWarnings("resource")
	@Test
	public void testOper() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IOperServiceSV userService = (IOperServiceSV) context.getBean("userService");
		System.out.println("=========================================");
		userService.addUser();
		System.out.println("=========================================");
		
		System.out.println("=========================================");
		userService.updateUser();
		System.out.println("=========================================");
		
		
		IOperServiceSV adminService = (IOperServiceSV) context.getBean("adminService");
		System.out.println("=========================================");
		adminService.addUser();
		System.out.println("=========================================");
		
		System.out.println("=========================================");
		adminService.updateUser();
		System.out.println("=========================================");
	}
}
