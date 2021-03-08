package com.interfaces.impl;

import com.interfaces.Left;
import com.interfaces.Right;

public class Ambiguity implements Left, Right {
	public static void main(String[] args) {
		Ambiguity ambiguity = new Ambiguity();
		ambiguity.m1();
	}

	@Override
	public void m1() {
		Left.super.m1();
		Right.super.m1();
	}

}
