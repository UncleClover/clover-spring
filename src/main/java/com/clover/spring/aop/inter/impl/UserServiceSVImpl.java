package com.clover.spring.aop.inter.impl;

import com.clover.spring.aop.inter.IOperServiceSV;

public class UserServiceSVImpl implements IOperServiceSV {

	@Override
	public void addUser() {
		System.out.println("add user info~~~~");
	}

	@Override
	public void updateUser() {
		System.out.println("update user info~~~~");
	}
}
