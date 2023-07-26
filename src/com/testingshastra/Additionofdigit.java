package com.testingshastra;

import java.util.Scanner;

public class Additionofdigit {
	public static void main(String[] args) {
		int[] x = { 12, 34, 11, 56, 74, 54, 98 };
		for (int i = 0; i < x.length; i++) {
			int n = x[i] / 10;
			int m = x[i] % 10;
			x[i] = n + m;
			System.out.print(x[i]+",");

		}
	}

}     
//public class Additionofdigi {
	//public static void main(String[] args) {
		//int y;
		//int num=0;
		//System.out.println("Enter no:");
	//	Scanner scan = new Scanner(System.in);
		//int x = scan.nextInt();
	//	while (x>0) {
		//	y=x%10;
		//	num=num+y;
			//x=x/10;
			
		//}
		//System.out.println(num);
	//}

//}

