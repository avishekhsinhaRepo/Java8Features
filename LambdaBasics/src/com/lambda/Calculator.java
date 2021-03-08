package com.lambda;

import com.lambda.functional.interfaces.Calculate;

/**
 * @apiNote This clearly shows the Functional Programing way !
 *
 */
public class Calculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.printResult((a, b) -> a + b);
		calculator.printResult((a, b) -> a - b);
		calculator.printResult((a, b) -> a * b);
		calculator.printResult((a, b) -> {
			if (b == 0)
				return 0;
			return a / b;
		});

	}

	private void printResult(Calculate cal) {
		System.out.println(cal.calculate(4, 2));

	}

}
