package com.interfaces.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(20);
		numList.add(2);
		numList.add(10);
		numList.add(15);
		Collections.sort(numList, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("After Custom Sorting(Reverse) = " + numList);
		
	}
}
