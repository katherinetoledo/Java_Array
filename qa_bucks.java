package com.qa.arrays;

import java.util.ArrayList;

public class ArrayLists {

	/*Downsides of Arrays
	 * Arrays are immutable, that means the length of the array
	 * or the value of the array (not the value of the elements within) cannot be changed
	 * Not as much functionality as other methods
	 * Not a simple to read all of the data from an array
	 * 
	 * ARRAY LISTS: a type of collection in Java (Random())
	 * Make our arrays resizable and gives us extra functonality to work with
	 */
	
	public static void arrayListDemo() {
		
		//Creating an array of pizza types
		String[] pizzaArray = new String[5];
		
		// Create an array list for types of pizza
		ArrayList<String> pizzaList = new ArrayList<>();
		
		//Array list methods
		
		//add - add something to the arrayList
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Marinara");
		System.out.println(pizzaList);
		
		
		//get - gets some data from the arraylist
		System.out.println(pizzaList.get(1));
		String retrivedPizza = pizzaList.get(2);
		System.out.println(retrivedPizza);
		
		
		//set  updating / replacing somthing in the array list
		pizzaList.set(0, "Pepperoni Pizza");
		System.out.println(pizzaList.get(0));
		
		//remove - removes something from the array list
		pizzaList.remove(0);
		System.out.println(pizzaList);
		
		// size - returns the size / length of the array list
		System.out.println("Before adding pizzas " + pizzaList.size());
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Marinara");
		System.out.println("After adding pizzas " + pizzaList.size());
		
		//For Loop for this - EXACTLY THE SAME
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}
		
		// clear - clear all data from the array list
		
		System.out.println("Before the clear " + pizzaList);
		pizzaList.clear();
		System.out.println("After the clear " + pizzaList);
		
		

		
	}
}
