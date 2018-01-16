package com.clover.spring.bean;

public class StringUitls {
	public void isBlank(String str){
		if(str == null || str == "" || str.trim().length() == 0){
			System.out.println("空字符串");
			return;
		}
		System.out.println("非空字符创");
	}
}
