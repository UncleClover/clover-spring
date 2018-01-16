package com.clover.spring.bean;


public class Vip {
	private StringUitls stringUitls;

	public StringUitls getStringUitls() {
		return stringUitls;
	}

	public void setStringUitls(StringUitls stringUitls) {
		this.stringUitls = stringUitls;
	}
	
	public void isBlank(String name){
		stringUitls.isBlank(name);
	}
}
