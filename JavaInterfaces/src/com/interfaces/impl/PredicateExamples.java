package com.interfaces.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		PredicateExamples predicateExamples = new PredicateExamples();
		String[] names = { "John", "Clark", "Stephen", "Ram" };
		List<String> nameList = new ArrayList<String>();
		nameList.add("Krish");
		List<String> emptyList = new ArrayList<String>();
		/* Predicate to check number is greater than 10 */
		Predicate<Integer> predicateGreaterThanTen = i -> i > 10;
		/* Predicate to check String length greater than 5 */
		Predicate<String> predicateStringLength = s -> s.length() > 5;
		predicateExamples.testPredicate(names, predicateStringLength);
		/* Predicate to check String Start with K */
		Predicate<String> predicateStartWithK = s -> s.startsWith("S");
		predicateExamples.testPredicate(names, predicateStartWithK);
		/* Predicate to check collection is empty of not */
		Predicate<Collection<String>> predicateEmptyCollection = c -> c.isEmpty();
		System.out.println(predicateGreaterThanTen.test(10));
		System.out.println(predicateGreaterThanTen.test(100));
		System.out.println(predicateEmptyCollection.test(nameList) + " " + predicateEmptyCollection.test(emptyList));
	}

	private void testPredicate(String[] names, Predicate<String> predicate) {
		for (String name : names) {
			if (predicate.test(name))
				System.out.println(name);
		}
	}

}
