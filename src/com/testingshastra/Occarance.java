package com.testingshastra;

import java.util.Hashtable;

public class Occarance {
	public static void main(String[] args) {
		String s = "Hello testing shastra";
		String input = s.replaceAll(" ", " ");
		Hashtable<Character, Integer> ht = new Hashtable<>();
		for (int i = 0; i < input.length(); i++) {
			if (ht.containsKey(input.charAt(i))) {
				int occ = ht.get(input.charAt(i));
				occ++;
				ht.put(input.charAt(i), occ);
			} else {
				ht.put(input.charAt(i), 1);
			}

		}
		System.out.println(ht);
	}


}
