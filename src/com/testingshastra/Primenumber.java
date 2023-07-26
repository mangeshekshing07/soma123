package com.testingshastra;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {

		System.out.println("Enter Number:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int count = 0;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				count = count + 1;
			}

		}
		if (count > 0) {
			System.out.println("Not prime");
		} else {
			System.out.println("Is Prime");
		}

	}

}
