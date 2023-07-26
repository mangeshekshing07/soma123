package com.testingshastra;

public class Occanrance1 {
	public static void main(String[] args) {
		String m = "Testing Shastra with Mangesh";
		m = m.toLowerCase();
		char[] p = m.toCharArray();
		System.out.println("Occarance of number in String");
		for (int i = 0; i < p.length; i++) {
			int count = 1;
			for (int j = i+1; j < p.length; j++) {
				if (p[i] == p[j]) {
					count++;
					p[j] = '0';
				}
			}
			if (p[i] != '0') {
				System.out.println(p[i] + "-" + count);
			}
		}

	}

}
