package com.exercises;

import java.lang.reflect.Array;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minimum = 0;
		int maximum = 0;

		int[] arr = { 19, 17, 12 };

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				minimum = arr[0];
				maximum = arr[0];
			} else if (arr[i] < minimum) {
				minimum = arr[i];
			} else if (arr[i] > maximum) {
				maximum = arr[i];
			} else {

			}

		}
		System.out.println("Minimum Value : " + minimum);
		System.out.println("Maximum Value : " + maximum);
		System.out.println("Sum of Minimum and maximum : " + (minimum + maximum));

	}

}
