package com.exercises;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "NewyorkEU";
		str = str.toLowerCase();
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		char singleChar = '\0'; //char singleChar='\u0000';

		for (int i = 0; i < str.length(); i++) {

			singleChar = str.charAt(i);

			if (singleChar == 'a' && aCount < 1) {
				aCount++;
			} else if (singleChar == 'e' && eCount < 1) {
				eCount++;
			} else if (singleChar == 'i' && iCount < 1) {
				iCount++;
			} else if (singleChar == 'o' && oCount < 1) {
				oCount++;
			} else if (singleChar == 'u' && uCount < 1) {
				uCount++;
			}
		}

		System.out.println("Total Unqiue Vowels Count : " + (aCount + eCount + iCount + oCount + uCount));

	}

}
