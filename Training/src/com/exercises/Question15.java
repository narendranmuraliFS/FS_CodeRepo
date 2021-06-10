package com.exercises;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hellowworld";
		char eachChar = '\0';
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {
			eachChar = str.charAt(i);
			if (!newStr.contains(String.valueOf(eachChar))) {
				newStr = newStr + eachChar;
			}
		}
		System.out.println(newStr);

	}

}
