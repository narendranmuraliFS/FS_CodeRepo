package com.exercises;

import java.util.Arrays;
import java.util.Iterator;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2020;
		boolean leapYear = false;
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println("Given Year is divisble by 4 , 100 and 400");
					leapYear = true;
					System.out.println("boolean leapYear is " + leapYear);
				}
				else {
					System.out.println("Given Year is not leap because it is not divisble by 400");
					System.out.println("boolean leapYear is " + leapYear);
				}
			}
			else {
				System.out.println("Given Year is not leap because it is not divisble by 100");
				System.out.println("boolean leapYear is " + leapYear);
			}
		}
		else {
			System.out.println("Given Year is not leap because it is not divisble by 4");
			System.out.println("boolean leapYear is " + leapYear);
		}
			
	}

}
