package com.testingshastra;

import java.util.Scanner;

public class facterial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Factoriyal");
		int x = scan.nextInt();
		int count = 1;
		for (int i = 1; i <= x; i++) {
			count = count * i;
		}
		System.out.println(count);
	}

}
