package com.clover.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.clover.spring.vo.Message;
import com.clover.spring.vo.Person;

public class Vip {
	private StringUitls stringUitls;
	
	@Autowired
	private Message message;
	
	@Autowired
	private Person person;
	
	private String code;

	public StringUitls getStringUitls() {
		return stringUitls;
	}

	public void setStringUitls(StringUitls stringUitls) {
		this.stringUitls = stringUitls;
	}
	
	public void isBlank(String name){
		stringUitls.isBlank(name);
	}

	public String getCode() {
		return code;
	}

	@Required
	public void setCode(String code) {
		this.code = code;
	}
	
	public void printMessage(){
		message.getMessage1();
		message.getMessage2();
	}
	
	public void sayHi(){
		person.sayHi();
	}
}
