package com.CoreProgramming;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print(" Please enter the first number: ");
		int FirstNum = scan.nextInt();

		System.out.print(" Please enter the second number: ");
		int SecondNum = scan.nextInt();

		System.out.println(" The two numbers are: " + FirstNum + " " + SecondNum);

		int temp = FirstNum;
		FirstNum = SecondNum;
		SecondNum = temp;
		System.out.println("After Swap the two numbers are :" + FirstNum + " " + SecondNum);
	}
}
