package com.interfaces;

public interface Greeting {
	default void greet() {
		System.out.println("Hello World !");
	}
	static void message() {
		System.out.println("Welcome");
	}
}
