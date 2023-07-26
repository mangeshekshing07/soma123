package com.testingshastra;

public class Smalltolarge {
	public static void main(String[] args) {
		int[] x = { 38, 45, 37, 11, 23, 34, 12, 78, 15 };
		for (int i = 0; i < x.length; i++) {

			for (int j = i + 1; j < x.length; j++) {
				int temp = 0;
				if (x[i] > x[j]) {
					
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}
			System.out.print(x[i] + ",");

		}
	}

}
