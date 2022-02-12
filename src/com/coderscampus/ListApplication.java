package com.coderscampus;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {
	public static void  main (String[] args) {
		int arraySize = 10;
		String[] names = new String[arraySize];
		 names [0] = "Dayton";
		 names [1] = "Elon Musk";
		 names [2] = "John Doe";
		 names [3] = "David Lobo";
		 names [4] = "Trevor Page";
				 
		// names [2] = null;
		 names [2] = "butter";
		 
		 for (String name : names) {
			 if (name != null) {
			 System.out.println(name);
			 }
		 }		

		 System.out.println("-------------------");
		 System.out.println("");
		 // Collections -> Java solution to common data structure problems
		 // List (a type of collection)
		 // Set (a type of collection)
		 // Map (a type of collection)
		 
		 
		 List<String> elements = new ArrayList<String>();
		 
		 elements.add("Trevor Page");
		 elements.add("John Doe");
		 elements.add("Jane Doe");
		 
		 
		 System.out.println("List Example: ");
		 System.out.println("");
		 printArrayListToConsole(elements);
		 
		 elements.remove(1);
		 printArrayListToConsole(elements);
		 
		 elements.remove("Trevor Page");
		 printArrayListToConsole(elements);
		 
	}

	private static void printArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			 System.out.println(element);
		 }
		System.out.println("");
	}
}
