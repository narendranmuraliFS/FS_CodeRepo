package com.exercises;

import java.lang.reflect.Array;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "aa", "b", "cc", "ddd" };
		int count = 0;
		int input = 1;

		for (String each : arr) {
			if (each.length() == input) {
				count++;
			}
		}
		System.out.println("There are " + count + " words with " + input + " length");
	}

}
