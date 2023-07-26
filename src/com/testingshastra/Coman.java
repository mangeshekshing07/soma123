package com.testingshastra;

public class Coman {
	public static void main(String[] args) {
		int[] x = { 12, 13, 34, 23, 17, 3 };
		int[] y = { 23, 34, 12, 19, 29, 45 };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {

				if (x[i] == y[j]) {
					System.out.print(x[i] + ",");

				}

			}

		}
	}

}
