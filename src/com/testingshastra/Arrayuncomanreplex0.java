package com.testingshastra;

public class Arrayuncomanreplex0 {
	public static void main(String[] args) {
		int x[] = { 12, 23, 43, 45, 67 };
		int y[] = { 67, 23, 21, 44, 66 };
		int m[] = new int[x.length];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i]==y[j]) {
					m[i]=x[i];
				}
			}
			System.out.print(m[i]+",");
		}
		
		
		
	}

}
