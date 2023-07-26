package com.testingshastra;

public class Second {
	public static void main(String[] args) {

		int[] x = { 23, 11, 45, 12, 19, 45, 12, 70 };
		int sl = 0;
		for (int i = 0; i < x.length; i++) {

			for (int j = i + 1; j < x.length; j++) {
				int tamp = 0;
				if (x[i] > x[j]) {

					tamp = x[i];
					x[i] = x[j];
					x[j] = tamp;
				}

			}
		}
		for (int k = x.length - 2; k >= 0; k--) {
			if (x[x.length - 1] != x[k]) {
				sl = x[k];
				break;

			}

		}
		System.out.println("Secound large number:" + sl);

	}

}
