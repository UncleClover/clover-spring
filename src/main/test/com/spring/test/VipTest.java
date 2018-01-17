package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clover.spring.bean.Vip;
import com.clover.spring.event.CustomEventPublisher;

public class VipTest {

	@Test
	public void userNameTest() {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();

		Vip vip = (Vip) context.getBean("vip");
		vip.isBlank("clover");
		System.out.println(vip.getCode());

		System.out.println("=======================================");
		vip.printMessage();

		vip.sayHi();

		System.out.println("**************************************************");
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();
		System.out.println("**************************************************");

		context.stop();
	}
}