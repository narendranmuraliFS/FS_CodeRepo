package com.exercises;

import java.util.Arrays;
import java.util.Iterator;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		String newString = "";

		for (int each1 : arr1) {
			boolean setBoolean = true;
			for (int each2 : arr2) {
				if (each2 == each1) {
					setBoolean = false;
					break;
				}
			}
			if (setBoolean == false) {
				// System.out.print(each1 + ",");
				newString = newString + each1 + ",";
			}
		}

		System.out.println();
		System.out.println(newString.substring(0, newString.length() - 1));

	}

}
