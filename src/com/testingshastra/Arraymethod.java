package com.testingshastra;

import java.util.ArrayList;

public class Arraymethod {
	public static void main(String[] args) {
		 ArrayList m = new ArrayList();
		
		m.add(12);
		m.add(13);
		m.add(14);
		m.add(23);
		m.add(11);
		
		
		System.out.println(m);
		System.out.println(m.get(2));
		//System.out.println(m.removeAll(m));
		System.out.println(m.remove(3));
		System.out.println(m);
	System.out.println(m.set(2, 23));
	System.out.println(m);
	
		
		
	}

}
