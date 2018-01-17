package com.clover.spring.aop.inter.impl;

import com.clover.spring.aop.inter.IOperServiceSV;

public class AdminServiceSVImpl implements IOperServiceSV {

	@Override
	public void addUser() {
		System.out.println("add admin info~~~~");
	}

	@Override
	public void updateUser() {
		System.out.println("update admin info~~~~");
	}

}
