package com.ymalik.JavaPrograms;

public class CompareStrings {
	public static void main(String arg[]) {
		String a = "YOGITA";
		String b = "yogita";

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are different");
		}
	}
}
