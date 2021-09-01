package com.qa.arrays;

import java.util.ArrayList;

public class ExerciseArrayCoffeeShop {

	
/*Array Lists Exercise:
You're working as a software dev for a well known coffee QABucks
You've got a list of orders and you need to have the following methods implemented to manage the orders:

2x array lists
- OrdersArray
- DoneOrdersArray
All methods you should be able to pass in data

- Add a new order to the orders array 
- Return the name of the order
- Modify the order (passing in a string)
- Remove the order from the orders array
- Add the order to the doneOrders array
- Prints out the length of the orders and doneOrders array
- clears either or both of the arrays

Orders to use:
Small Espresso w/ Chocolate
Large Cold Brew w/ double shot
Medium Cappucino w/ Oat Milk
Medium Flat White
Large Choc Cookie Frappe w/ sugar free syrup
Small Caramel Iced Latte w/ honeycomb dust
Small Americano
Large Cafe Au Lait w/ extra milk
Medium Strawberry Iced Tea

Stretch goal - Using Multi Dimensional (Or objects if you're comfortable) split the orders into Size, drink and extras

{{"small", "espresso", "chocolate"}, {}, {}}
 * 
 */
	
	public static void main (String[] args) {
	
		ArrayList<String> ordersArray = new ArrayList<String>();
		ArrayList<String> doneOrdersArray = new ArrayList<String>();
		
		addOrder("Small Espresso w/ Chocolate", ordersArray);
		addOrder("Large Cold Brew w/ double shot", ordersArray);
		addOrder("Medium Cappucino w/ Oat Milk", ordersArray);
		addOrder("Medium Flat White", ordersArray);
		addOrder("Large Choc Cookie Frappe w/ sugar free syrup", ordersArray);
		addOrder("Small Caramel Iced Latte w/ honeycomb dust", ordersArray);
		addOrder("Small Americano", ordersArray);
		addOrder("Large Cafe Au Lait w/ extra milk", ordersArray);
		addOrder("Medium Strawberry Iced Tea", ordersArray);
		System.out.println(ordersArray);
		
		System.out.println("============================");
		
		System.out.println("Order No. 1: " + ordersArray.get(0));
		getOrder(ordersArray);
		modifyOrder(0,"Double Espresso w/ Chocolate", ordersArray);
		System.out.println("Changed order No. 1: " + ordersArray.get(0));
		
		System.out.println("============================");
		
		removeOrder(1, ordersArray);
		addingDoneOrders("Large Espresso w/ Chocolate", doneOrdersArray);
		printArraysLength(doneOrdersArray, ordersArray);
		clearArray(doneOrdersArray,ordersArray,false, false);
		printArraysLength(doneOrdersArray, ordersArray);
		
	}
	
	public static void addOrder(String order, ArrayList<String> ordersArray) {
		ordersArray.add(order);
	}
	
	public static String getOrder(ArrayList<String> ordersArray) {
		return ordersArray.get(ordersArray.size()-1);
	}
	
	public static void modifyOrder (int index, String order, ArrayList<String> ordersArray) {
		ordersArray.set(index, order);
	}

	public static void removeOrder (int index, ArrayList<String> ordersArray) {
		ordersArray.remove(index);
	}
	
	public static void addingDoneOrders(String order, ArrayList<String> doneOrdersArray) {
		doneOrdersArray.add(order);
	}
	
	public static void printArraysLength(ArrayList<String> doneOrdersArray,ArrayList<String> ordersArray) {
		System.out.println("Length of ordersArray is " + ordersArray.size());
		System.out.println("Length of doneOrdersArray is " + doneOrdersArray.size());
	}
	
	public static void clearArray (ArrayList<String> doneOrdersArray, ArrayList<String> ordersArray, boolean clearBoth, boolean clearDoneOrder) {
		if(clearBoth) {
			doneOrdersArray.clear();
			ordersArray.clear();
		} else if (clearDoneOrder) {
			doneOrdersArray.clear();
		} else {
			ordersArray.clear();
		}
				
	}
	
}
