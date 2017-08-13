package com.ymalik.JavaPrograms;

public class SwapWithTemp {

	public static void main(String[] arg) {
		int x = 6;
		int y = 4;

		System.out.println("Value of a befor swaping is:" + x);
		System.out.println("Value of b before swaping is:" + y);

		swap(x, y);

	}

	private static void swap(int x, int y) {

		int temp = x;
		x = y;
		y = temp;
		System.out.println("Value of a after swaping is:" + x);
		System.out.println("Value of b after swaping is:" + y);

	}

}