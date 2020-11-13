package eu.webfarmr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		String[] cities = new String[3]; // first way of creating an array - by specifying its size
		cities = new String[] {"Charlotte", "Raleigh", "Wilmington", "Beaufort"}; // second way of creating an array - by specifying its contents
		// We cannot grow arrays - their size is fixed
		cities[2] = "Charlotte"; // you can set a value at a specific index
		for (int i = 0; i < cities.length; i++) {
			// Array indices start at zero (0)
			System.out.println(cities[i]);
		}
		
		List<String> states = new ArrayList<String>(); // a new empty list - we can add members on the fly and grow the list.
		states = new LinkedList<String>(); // Another kind of list
		for (int i = 0; i < cities.length; i++) {
			states.add(cities[i]);
		}
	}
}
