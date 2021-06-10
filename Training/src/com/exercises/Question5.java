package com.exercises;

import java.lang.reflect.Array;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "2aa", "12", "ABC", "C1a" };
		int sum = 0;
		char eachChar = '\0';
		int eachInt;

		for (String each : arr) {
			for (int i = 0; i < each.length(); i++) {
				eachChar = each.charAt(i);
				eachInt = (int) eachChar;
				if (eachInt >= 48 && eachInt <= 57) {
					sum = sum + Integer.parseInt(String.valueOf(eachChar));
				}
			}
		}
		System.out.println("Count of all numbers in the given String Array : " + (sum));

	}

}
