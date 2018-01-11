package com.clover.spring.vo;

public class Message {
	private String message;
	
	public Message() {
		System.out.println("===========================正在被初始化==================================");
	}

	public void getMessage() {
		System.out.println("信息：" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
