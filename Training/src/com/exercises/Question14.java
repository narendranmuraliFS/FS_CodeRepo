package com.exercises;

import java.util.Arrays;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "abc", "da", "ram" };
		int input = 3;

		for (String each : str) {
			if (each.length() >= input) {
				System.out.print(each.charAt(input-1));
			} else {
				System.out.print("$");
			}

		}
	}

}
