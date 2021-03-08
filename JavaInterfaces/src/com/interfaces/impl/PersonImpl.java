package com.interfaces.impl;

import com.interfaces.Greeting;

public class PersonImpl implements Greeting{

	public static void main(String[] args) {
		PersonImpl person = new PersonImpl();
		Greeting.message();
		person.greet();
		
	}

}
