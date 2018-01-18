package com.clover.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggerHandler {

	// 切点
	@Pointcut("execution(* com.clover.spring.aop.inter.IOperServiceSV.*(..))")
	private void loggerAspect() {
	}

	@Before("loggerAspect()")
	public void before() {
		System.out.println("前置通知~");
	}

	@After("loggerAspect()")
	public void after() {
		System.out.println("后置通知~");
	}

	@Around("execution(* com.clover.spring.aop.inter.IOperServiceSV.*(..))")
	public void log(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("1正在记录日志~");
		pjp.proceed();
		System.out.println("2正在记录日志~");
	}
}
