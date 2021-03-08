package com.interfaces.impl;

import com.interfaces.Calculate;
import com.interfaces.StringLength;

public class Calculator {

	public static void main(String[] args) {
		Calculate calculate = (operand1, operand2) -> operand1+operand2;
		System.out.println(calculate.add(1, 2));
		StringLength stringLength = (string) -> string.length();
		System.out.println(stringLength.getStringLength("Hello"));
	}

}
