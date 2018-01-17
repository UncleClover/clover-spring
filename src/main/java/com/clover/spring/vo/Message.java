package com.clover.spring.vo;

public class Message {
	private String message1;
	private String message2;
	
	public void getMessage1() {
		System.out.println("信息：" + message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	
	public void getMessage2() {
		System.out.println("信息：" + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void init(){
		System.out.println("正在初始化bean~");
	}
	
	public void destroy(){
		System.out.println("正在销毁bean~");
	}
}
