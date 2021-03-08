package com.interfaces.impl;

import java.util.Map;
import java.util.TreeMap;

public class MapSorting {
	public static void main(String[] args) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		treeMap.put(10, "John");
		treeMap.put(1, "Doe");
		treeMap.put(3, "Oliver");
		treeMap.put(2, "Wells");
		System.out.println(treeMap);
	}
}
