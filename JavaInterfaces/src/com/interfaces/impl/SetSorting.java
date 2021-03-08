package com.interfaces.impl;

import java.util.Set;
import java.util.TreeSet;

public class SetSorting {
	public static void main(String[] args) {
		Set<Integer> numSet = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		numSet.add(20);
		numSet.add(2);
		numSet.add(10);
		numSet.add(15);
		System.out.println("After Custom Sorting(Reverse) = " + numSet);
	}
}
