package com.coderscampus;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class setApplication {
	public static void main(String[] args) {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		
		// Sets do not allow duplicates
		// LinkedHashSet vs just  HashSet = Linked maintains order in 1 2 3 4 5 6 just like a list
		//   								in the order that you put them in. 
		// the add method returns a boolean so you can just print it out as true or false
		
		
		uniqueNumbers.add(1);
		uniqueNumbers.add(2);
		uniqueNumbers.add(3);
		uniqueNumbers.add(4);
		uniqueNumbers.add(5);
		uniqueNumbers.add(6);
		uniqueNumbers.add(1);
		uniqueNumbers.add(1);
		uniqueNumbers.add(1);
		uniqueNumbers.add(1);
		uniqueNumbers.add(1);
		
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(7));
		
		printSetToConsole(uniqueNumbers);
		
		
		
		Set<String> uniqueNames = new HashSet<>();
		
		
		
		
	}
	
	private static void printSetToConsole(Set<Integer> elements) {
		for (Integer element : elements) {
			 System.out.println(element);
		 }
		System.out.println("");
	}
	
}
