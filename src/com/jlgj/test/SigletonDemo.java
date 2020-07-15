package com.jlgj.test;

public class SigletonDemo {

	public static void main(String[] args) {

	}

}
//¶öººÊ½
class Singleton{
	
	private static Singleton singleton = new Singleton();
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}