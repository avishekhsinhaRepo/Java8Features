package com.lambda;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int count = 0; count < 10; count++)
				System.out.println(count);
		});
		thread.start();
	}
}
