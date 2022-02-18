package com.CoreProgramming;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter an Year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (year < 1000 || year > 9999) {
			System.out.println(" Please enter a year of four digits");
			sc.close();
			return;
		}

		/*
		 * Check if the year is divisible by 4 but not 100, DISPLAY "leap year" 
		 * Check if the year is divisible by 400, DISPLAY "leap year"
		 * Otherwise, DISPLAY "not leap year"
		 */
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified year is not a leap year");
	}
}
