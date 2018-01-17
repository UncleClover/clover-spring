package com.clover.spring.aop;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class TimeHandler {
	public void printTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("current time is " + sdf.format(new Date(System.currentTimeMillis())));
	}
}
