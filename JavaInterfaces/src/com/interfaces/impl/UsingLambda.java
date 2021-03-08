package com.interfaces.impl;

import com.interfaces.Parent;

public class UsingLambda {

	public static void main(String[] args) {
		Parent parent = ()-> {System.out.println("Parent Implementer");};
		parent.m1();

	}

}
