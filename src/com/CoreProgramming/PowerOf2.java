package com.CoreProgramming;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		System.out.print(" Please enter the number to find power of 2: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num > 31 || num < 0) {
			System.out.println(" Please enter the number between 0 and 31");
		}

		System.out.println("The power of 2^" + num + " is");
		for (int i = 1; i <= num; i++) {
			System.out.println(Math.pow(2, i));
		}

	}
}
