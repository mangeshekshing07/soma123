package com.testingshastra;

import java.util.Scanner;

public class Xtable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table no:");
		int x = sc.nextInt();
		for (int i = 1; i <=10; i++) {
			int y = x * i;
			System.out.println(x+"*"+i+"="+y);
		}
		
	}

}
