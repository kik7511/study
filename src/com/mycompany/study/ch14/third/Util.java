package com.mycompany.study.ch14.third;

public class Util {
//	public static void boxing(String a)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public String aaa (String name) {
		String xxxx = "";
		
		return xxxx;
	}
}
