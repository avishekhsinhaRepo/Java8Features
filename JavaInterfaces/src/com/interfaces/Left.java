package com.interfaces;

public interface Left {
	default void m1() {
		System.out.println("From left");
	}
}
