package com.ymalik.JavaPrograms;

public class SwapwithoutTemp {
	public static void main(String[] arg) {
		int x = 10;
		int y = 20;
		System.out.println("Value of x before swaping is: " + x);
		System.out.println("Value of y before swaping is: " + y);
		System.out.println("====================================");
		swap(x, y);

	}

	public static void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - 10;

		System.out.println("Value of x after swaping is: " + x);
		System.out.println("Value of y after swaping is: " + y);

	}
}
