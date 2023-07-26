package com.testingshastra;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int x = Scan.nextInt();
		if (x % 2 == 0) {
			System.out.println(x + "is a even number");

		} else {
			System.out.println(x + "is a odd number");
		}
		
	}

}
