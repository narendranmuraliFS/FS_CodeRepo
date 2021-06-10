package com.exercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Question8 {

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;
		double result = 0.0d;
		int squareRootValue = 0;

		result = ((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2));
		squareRootValue = (int) Math.sqrt(result);
		System.out.println(squareRootValue);

	}

}
