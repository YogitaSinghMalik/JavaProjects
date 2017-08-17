package com.ymalik.JavaPrograms;

import java.util.ArrayList;

public class ArrayListProgram {
	public static void main(String[] args) {
		// creation of ArrayList
		ArrayList<String> obj = new ArrayList<String>();
		// elements to be added in ArrayList
		obj.add("Shikha");
		obj.add("Ajay");
		obj.add("Shailendra");
		obj.add("Yogita");
		obj.add("Kunal");
		obj.add("Shammi");
		System.out.println("First ArrayList is : " + obj);
		// Size of ArrayList
		int noOfElement = obj.size();
		System.out.println("Size of ArrayList is : " + noOfElement);
		// add element to an index
		obj.add(4,"Vandana");
		System.out.println("ArrayList after adding element @ Index is : " + obj);
		// remove element from arrayList
		obj.remove("Shammi");
		System.out.println("ArrayList after removing element is : " + obj);
		// remove element from arrayList
		obj.remove(2);
		System.out.println("ArrayList after removing element is : " + obj);
		//get element present on mentioned index
		String name = obj.get(2);
		System.out.println("Element @ 3rd position should be YOGITA : " + name);
		//Replace element present @ mentioned index
		obj.set(3,"Gaurav");
		System.out.println("Element @ 4th position should be replaced with Gaurav : " + obj);
		// Find position of Yogita
		int position = obj.indexOf("Yogita");
		System.out.println("position of element Yogita is : " + position);
		//Find position of element which is not present in arrayList
		int position1 = obj.indexOf("Shammi");
		System.out.println("position of element not present in ArrayList is : " + position1);
		// Clear Array List
		obj.clear();
		System.out.println("ArrayList is empty : " + obj);
		
		
	}

}
