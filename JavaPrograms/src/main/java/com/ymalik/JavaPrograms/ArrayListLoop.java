package com.ymalik.JavaPrograms;

import java.util.ArrayList;

public class ArrayListLoop {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(7);
		arrlist.add(14);
		arrlist.add(28);
		arrlist.add(21);

		// for loop

		System.out.println("Use of For Loop");
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}

		// Advanced/Enhanced For Loop
		System.out.println("Use of Advanced/Enhanced Loop");
		for (Integer j : arrlist) {
			System.out.println(j);

		}
		
		// While Loop
		System.out.println("Use of While Loop");
		int k = 0;
		while (arrlist.size() > k)
		{
		System.out.println(arrlist.get(k));
		k++;
		}
		
		//ITERTATORS
		
    }
	
}


