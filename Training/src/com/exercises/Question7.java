package com.exercises;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "test@gail.com";
		String newEmail = "";
		String sString = "";
		int atCount = 0;
		int dotCount = 0;
		int indexOfAt = 0;
		int indexOfDot = 0;
		boolean flag = false;

		if (email.contains("@") && email.contains(".")) {
			atCount = email.length() - email.replace("@", "").length();
			dotCount = email.length() - email.replace(".", "").length();
			if (atCount == dotCount) {
				indexOfAt = email.indexOf('@');
				indexOfDot = email.indexOf('.');
				sString = email.substring(indexOfAt + 1, indexOfDot);
				if (sString.length() == 4) {
					sString = email.substring(0, indexOfAt);
					if (sString.length() >= 3) {
						sString = email.substring(indexOfDot, email.length());
						if (sString.equalsIgnoreCase(".com")) {
							flag = true;
						}
					}
				}
			}
			{

			}
		}
		System.out.println("OutPut is : " + flag);

	}

}
