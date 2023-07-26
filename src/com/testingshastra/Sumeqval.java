package com.testingshastra;

import java.util.Scanner;

public class Sumeqval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum number");
		int num = sc.nextInt();
		int[] x = { 11, 34, 56, 23, 9, 13, 4, 8 };

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				int result = x[i] + x[j];
				if (result == num) {
					System.out.println(x[i] + "And" + x[j]);
				}

			}

		}
	}

}
