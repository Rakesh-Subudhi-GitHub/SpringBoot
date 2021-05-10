package com.rk.main;

import java.lang.reflect.Field;

import com.rk.beans.User;

public class MainTest {

	public static void main(String[] args) throws Exception {
		
		Class<?> clz=Class.forName("com.rk.beans.User");
		
		Field ageField=clz.getDeclaredField("age");
		ageField.setAccessible(true);
		
		Object obj=clz.newInstance();
		
		ageField.set(obj,20);
		
		System.out.println(obj);
		
		
	}//main

}//class
