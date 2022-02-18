package com.CoreProgramming;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the divisor:: ");
		int divisor = sc.nextInt();
		System.out.println("Enter the value of the divident:: ");
		int divident = sc.nextInt();

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("Quotient value when " + divident + "/" + divisor + " is: " + quotient);
		System.out.println("Remainder value " + divident + "/" + divisor + " is: " + remainder);
	}
}
