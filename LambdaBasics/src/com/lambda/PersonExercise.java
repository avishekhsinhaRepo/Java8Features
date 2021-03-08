package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lambda.functional.interfaces.PersonFilter;
import com.lambda.models.Person;

public class PersonExercise {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Charles", "Dickens"), new Person("John", "Doe"),
				new Person("Samanta", "Beth"), new Person("Dan", "Wilson"));

		PersonExercise personExercise = new PersonExercise();
		PersonFilter personFilter = person -> person.getLastName().startsWith("W");
		PersonFilter personFilterAll = person -> true;

		personExercise.printPerson(persons, personFilter);
		System.out.println("*****************************************");
		Comparator<Person> personComparator = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Collections.sort(persons, personComparator);
		personExercise.printPerson(persons, personFilterAll);

	}

	public void printPerson(List<Person> persons, PersonFilter personFilter) {
		for (Person person : persons) {
			if (personFilter.test(person))
				System.out.println(person);
		}

	}

	

}
