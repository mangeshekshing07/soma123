package com.testingshastra;

public class Arraycomanreplex0 {
	public static void main(String[] args) {
		int x[] = { 12, 23, 45, 65, 28, 48 };
		int y[] = { 65, 22, 12, 21, 98, 45 };
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					x[i]=0;
				}

			}
			System.out.print(x[i]+",");
		}

	}

}
