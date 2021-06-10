package com.exercises;

import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 174;
		int quotient = 0;
		int remainder = 0;
		String newNumber = "";

		while (number > 0) {
			quotient = number / 2;
			remainder = number % 2;
			number = quotient;
			newNumber = String.valueOf(remainder) + newNumber;
		}

		System.out.println(newNumber);

		// or

		System.out.println(Integer.toBinaryString(174));

	}

}
