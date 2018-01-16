package com.clover.spring.bean;

public class User {
	private StringUitls stringUtils;

	public User(StringUitls stringUtils) {
		this.stringUtils = stringUtils;
	}
	
	public void isBlank(String name){
		stringUtils.isBlank(name);
	}
}
