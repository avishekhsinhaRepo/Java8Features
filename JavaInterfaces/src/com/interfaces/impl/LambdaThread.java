package com.interfaces.impl;

public class LambdaThread {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Thread.currentThread().setName("Child Thread");
			for (int childThreadCount = 0; childThreadCount < 10; childThreadCount++)
				System.out.println(Thread.currentThread().getName() + "-" + childThreadCount);
		});
		thread.start();
		for (int mainThreadCount = 0; mainThreadCount < 10; mainThreadCount++)
			System.out.println(Thread.currentThread().getName() + "-" + mainThreadCount);

	}
}
