package com.lambda.functional.interfaces;

import com.lambda.models.Person;

@FunctionalInterface
public interface PersonFilter {
	boolean test(Person person);
}
