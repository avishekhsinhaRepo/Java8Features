package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.lambda.models.Person;

public class PersonExercisePredicate {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens"), new Person("John", "Doe"),
				new Person("Samanta", "Beth"), new Person("Dan", "Wilson"));
		PersonExercisePredicate personExercisePredicate = new PersonExercisePredicate();
		personExercisePredicate.printPersonCondionally(persons, person -> true, person -> System.out.println(person));
		System.out.println("*****************************************");
		Comparator<Person> personComparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Collections.sort(persons, personComparator);
		personExercisePredicate.printPersonCondionally(persons, person -> person.getLastName().startsWith("W"), person -> System.out.println(person));
	}

	public void printPersonCondionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person))
				consumer.accept(person);
		}

	}

}
