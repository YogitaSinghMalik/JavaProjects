package com.ymalik.JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public static void main (String[]  args){
		//Sorting of String ArrayList
		ArrayList<String> country = new ArrayList <String> ();
		country.add("India");
		country.add("USA");
		country.add("Canada");
		country.add("Switzerland");
		country.add("SriLanka");
		System.out.println("String ArrayList before Sorting is:");
		for (String i : country)
		{
			System.out.println(i);				
		} 
		
		// Sorting Sting
		Collections.sort(country);
		System.out.println("----------------------------");
		System.out.println("String ArrayList After Sorting is:");
		for (String i : country)
		{
			System.out.println(i);			
			
		} 
		//Sorting in descending order
		Collections.sort(country, Collections.reverseOrder());
		System.out.println("-----------------------------");
		System.out.println("Descending order of String ArrayList is:");
		for (String i : country)
		{
			System.out.println(i);			
			
		} 
		
		//Sorting Of Integer ArrayList
		ArrayList <Integer> num = new ArrayList <Integer> ();
		num.add(10);
		num.add(5);
		num.add(2);
		num.add(1);
		num.add(7);
		System.out.println("==========================================================");
		System.out.println("Integer ArrayList Before Sorting is: ");
		for (Integer j : num){
			System.out.println(j);
		}
		Collections.sort(num);
		System.out.println("-----------------------------");
		System.out.println("ArrayList After Sorting is: ");
		for (Integer j : num){
			System.out.println(j);
		}
		Collections.sort(num,Collections.reverseOrder());
		System.out.println("-----------------------------");
		System.out.println("Descending order of Integer ArrayList is:");
		for (Integer j : num)
		{
			System.out.println(j);			
			
		} 
		
	}

}
