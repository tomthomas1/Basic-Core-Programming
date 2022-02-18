package com.CoreProgramming;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number");
		int num = scan.nextInt();
          // if the given num is divisible by 2 then it is prime num or else odd num
		if (num % 2 == 0)
			System.out.println("Given number is prime");

		else
			System.out.println("Given number is Odd");
	}
}
