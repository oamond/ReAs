package com.demo;

public interface HelloJava8Interface {
	
	public static void hiStatic() {
		System.out.println("Hello from static method within");
	}
	
	default void hiDefault() {
		System.out.println("hi from default methods from Java 8 and above");
	}
}
