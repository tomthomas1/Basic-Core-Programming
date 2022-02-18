package com.CoreProgramming;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the total number of times the coin should be flipped. ");
		double flip = scanner.nextDouble();

		double heads = 0;
		double tails = 0;

		for (int i = 0; i < flip; i++) {
			int coin = (int) Math.floor(Math.random() * 2);   //to generate heads or tails
			if (coin == 1) {
				heads = heads + 1;     //incrementing the heads 
			} else {
				tails = tails + 1;
			}
		}

		System.out.println("Total percentage of heads flipped is : " + Math.floor((heads / flip) * 100));   //we are using the Math.floor so that we get the highest value 
		System.out.println("Total percentage of tails flipped is : " + Math.floor((tails / flip) * 100));
	}
}
