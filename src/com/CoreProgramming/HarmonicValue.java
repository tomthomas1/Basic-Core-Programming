package com.CoreProgramming;

import java.util.Scanner;

public class HarmonicValue {
	public static void main(String arg[]) {
		double num, i;
		double sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextDouble();
		for (i = 1; i <= num; i++) {
			sum = sum + (1 / i);   // to calculate the harmonic value
		}
		System.out.println("Harmonic value of " + num + " is " + sum);
	}
}
