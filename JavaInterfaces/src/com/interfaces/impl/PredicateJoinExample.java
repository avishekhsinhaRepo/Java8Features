
package com.interfaces.impl;

import java.util.function.Predicate;

public class PredicateJoinExample {

	public static void main(String[] args) {
		Integer[] testNumbers = { 10, 20, 45, 11, 87, 90, 1 };
		Predicate<Integer> predicateGreaterThanTen = i -> i > 10;
		Predicate<Integer> predicateEvenNumber = i -> i % 2 == 0;
		PredicateJoinExample predicateJoinExample = new PredicateJoinExample();
		System.out.println("Even number greater than 10");
		predicateJoinExample.testJoinPredicate(testNumbers, predicateGreaterThanTen.and(predicateEvenNumber));
		System.out.println("Even number or greater than 10");
		predicateJoinExample.testJoinPredicate(testNumbers, predicateGreaterThanTen.or(predicateEvenNumber));
		System.out.println("Not Even number and less than 10");
		predicateJoinExample.testJoinPredicate(testNumbers, predicateGreaterThanTen.or(predicateEvenNumber.negate()));
	}

	public void testJoinPredicate(Integer[] testNumbers, Predicate<Integer> joinPredicate) {
		for (Integer number : testNumbers) {
			System.out.println(number + " " + joinPredicate.test(number));
		}
	}

}