package com.lambda;

import com.lambda.functional.interfaces.LambdaTestInterface;

public class TestLambda {
	public static void main(String[] args) {
			LambdaTestInterface lambdaTestInterface = ()->System.out.println("Hello World!");
			lambdaTestInterface.greet();
	}
}
