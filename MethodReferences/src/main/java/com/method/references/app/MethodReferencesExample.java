package com.method.references.app;

import com.method.references.app.interfaces.Greeting;

public class MethodReferencesExample{

	public static void main(String[] args) {
			Greeting greeting = MethodReferencesExample::sayHello;
			greeting.greet();

	}
	
	public static void sayHello() {
		System.out.println("Hello World!");
		
	}

}
